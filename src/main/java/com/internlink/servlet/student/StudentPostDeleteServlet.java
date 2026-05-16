package com.internlink.servlet.student;

import com.internlink.dao.StudentPostDAO;
import com.internlink.dao.StudentProfileDAO;
import com.internlink.model.StudentPost;
import com.internlink.model.StudentProfile;
import com.internlink.util.SessionUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/student/posts/delete")
public class StudentPostDeleteServlet extends HttpServlet {

    private final StudentProfileDAO profileDAO = new StudentProfileDAO();
    private final StudentPostDAO postDAO = new StudentPostDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            String postId = req.getParameter("postId");
            if (postId == null || postId.isBlank()) {
                resp.sendRedirect(req.getContextPath() + "/student/dashboard");
                return;
            }

            StudentProfile profile = profileDAO.findByUserId(SessionUtil.getUserId(req));
            if (profile == null) {
                resp.sendRedirect(req.getContextPath() + "/student/profile");
                return;
            }

            StudentPost post = postDAO.findById(postId);
            if (post == null || post.getUserId() != profile.getUserId()) {
                resp.sendRedirect(req.getContextPath() + "/student/dashboard");
                return;
            }

            postDAO.delete(postId);
            resp.sendRedirect(req.getContextPath() + "/student/dashboard");
        } catch (Exception e) {
            throw new ServletException("Unable to delete student post", e);
        }
    }
}