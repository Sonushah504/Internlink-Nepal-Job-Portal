# InternLink Nepal
**A Trusted Centralized Platform for Internship and Job Placement in Nepal**

---

## Project Structure

```
InternLinkNepal/
├── pom.xml                            ← Maven build config
├── data/
├── docs/
│   └── README.md                      ← This file
├── sql/
│   ├── migration_upgrade_oauth_reset.sql
│   └── schema.sql                     ← Full DB schema + seed data
├── src/
│   └── main/
│       ├── java/com/internlink/
│       │   ├── dao/                       ← Database Access Objects
│       │   │   ├── ApplicationDAO.java
│       │   │   ├── CompanyDAO.java
│       │   │   ├── JobPostingDAO.java
│       │   │   ├── StudentProfileDAO.java
│       │   │   └── UserDAO.java
│       │   ├── filter/
│       │   │   └── AuthFilter.java        ← Role-based route protection
│       │   ├── model/                     ← Plain Java model classes
│       │   │   ├── Application.java
│       │   │   ├── Company.java
│       │   │   ├── JobPosting.java
│       │   │   ├── StudentProfile.java
│       │   │   └── User.java
│       │   ├── servlet/
│       │   │   ├── HomeServlet.java       ← Landing page
│       │   │   ├── auth/
│       │   │   │   ├── LoginServlet.java
│       │   │   │   ├── LogoutServlet.java
│       │   │   │   └── RegisterServlet.java
│       │   │   ├── student/
│       │   │   │   └── StudentDashboardServlet.java
│       │   │   ├── company/
│       │   │   │   ├── CompanyDashboardServlet.java
│       │   │   │   ├── PostJobServlet.java
│       │   │   │   └── UpdateStatusServlet.java
│       │   │   └── admin/
│       │   │       ├── AdminDashboardServlet.java
│       │   │       └── AdminVerifyCompanyServlet.java
│       │   └── util/
│       │       ├── DBConnection.java      ← JDBC connection helper
│       │       ├── PasswordUtil.java      ← BCrypt hashing
│       │       └── SessionUtil.java       ← Session management
│       └── resources/
│           └── internlink.properties
└── webapp/
    ├── index.jsp                  ← Forwards to HomeServlet
    ├── assets/
    │   ├── css/
    │   │   └── main.css           ← All styles
    │   ├── images/
    │   └── js/
    │       └── main.js             ← Carousel, charts, maps, modals
    ├── components/
    │   ├── auth-head.jsp
    │   ├── auth-tail.jsp
    │   ├── footer.jsp             ← Shared footer
    │   └── header.jsp             ← Shared navbar
    ├── pages/
    │   ├── companies.jsp
    │   ├── home.jsp               ← Landing page (carousel + map)
    │   ├── jobs.jsp
    │   ├── notifications.jsp
    │   ├── admin/
    │   │   ├── companies.jsp
    │   │   ├── dashboard.jsp
    │   │   ├── jobs.jsp
    │   │   └── students.jsp
    │   ├── auth/
    │   │   ├── forgot-password-verify.jsp
    │   │   ├── forgot-password.jsp
    │   │   ├── login.jsp
    │   │   └── register.jsp
    │   ├── company/
    │   │   ├── dashboard.jsp      ← Worker details + charts + map
    │   │   ├── jobs.jsp
    │   │   ├── postJob.jsp
    │   │   └── profile.jsp
    │   ├── error/
    │   │   ├── 404.jsp
    │   │   └── 500.jsp
    │   ├── profiles/
    │   │   ├── company.jsp
    │   │   └── student.jsp
    │   └── student/
    │       ├── applications.jsp
    │       ├── dashboard.jsp
    │       ├── portfolio.jsp
    │       └── profile.jsp
    └── WEB-INF/
        └── web.xml
