<%@ page contentType="text/html;charset=UTF-8" %>

<%
if(session.getAttribute("user") == null){
    response.sendRedirect("login.jsp");
    return;
}
%>
<!DOCTYPE html>
<html>
<head>
    <title>IT-Shaala Dashboard</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body { background-color:#f4f6f9; }
        .navbar { background:#0d6efd; }
        .sidebar {
            height:100vh; background:#343a40; color:white; padding-top:20px;
        }
        .sidebar a {
            color:white; text-decoration:none; display:block; padding:12px;
        }
        .sidebar a:hover { background:#495057; }
        .card { border:none; }
    </style>
</head>

<body>

<nav class="navbar navbar-dark">
    <div class="container-fluid">
        <span class="navbar-brand">IT-Shaala Admin Dashboard</span>
        <a href="logout" class="btn btn-light">Logout</a>
    </div>
</nav>

<div class="container-fluid">
<div class="row">

<!-- Sidebar -->
<div class="col-md-2 sidebar">
    <h5 class="text-center">Menu</h5>
    <a href="/viewCourses">View Courses</a>
    <a href="/Course/addCourse.jsp">Add Course</a>

    <a href="/viewBatch">View Batches</a>
    <a href="/Batch/addBatch.jsp">Add Batch</a>

<!-- Main Content -->
<div class="col-md-10 p-4">

    <h2>Welcome Admin </h2>
    <p class="text-muted">Institute Management System Overview</p>

    <div class="row mt-4">

        <div class="col-md-4">
            <div class="card shadow p-4 text-center">
                <h3>Courses</h3>
                <p>Manage all available courses.</p>
                <small class="text-muted">Use sidebar to add/view courses</small>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card shadow p-4 text-center">
                <h3> Batches</h3>
                <p>Track all running batches.</p>
                <small class="text-muted">Use sidebar to manage batches</small>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card shadow p-4 text-center">
                <h3>Students</h3>
                <p>Student module coming next.</p>
                <small class="text-muted">Future enhancement</small>
            </div>
        </div>

    </div>

</div>
</div>
</div>

</body>
</html>