<%@ page import="java.util.*,com.itshaala.model.Course" %>
<%
List<Course> list = (List<Course>) request.getAttribute("courseList");
%>

<!DOCTYPE html>
<html>
<head>
    <title>All Courses</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body { background:#f4f6f9; }
        .card { border:none; }
    </style>
</head>

<body>

<div class="container mt-5">

    <div class="card shadow-lg p-4">

        <div class="d-flex justify-content-between mb-3">
            <h2> Course Management</h2>
            <div>
                <a href="/Course/addCourse.jsp" class="btn btn-primary">+ Add Course</a>
                <a href="/dashboard" class="btn btn-secondary">Dashboard</a>
            </div>
        </div>

        <table class="table table-striped table-hover">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Course Name</th>
                    <th>Duration</th>
                    <th>Fees </th>
                    <th style="width:180px;">Actions</th>
                </tr>
            </thead>

            <tbody>
            <% if(list != null){
               for(Course c : list){ %>
                <tr>
                    <td><%= c.getCourseId() %></td>
                    <td><%= c.getCourseName() %></td>
                    <td><%= c.getCourseDuration() %></td>
                    <td><%= c.getCourseFee() %></td>

                    <!-- ACTION BUTTONS -->
                    <td>
                        <a href="editCourse?id=<%= c.getCourseId() %>"
                           class="btn btn-warning btn-sm">Edit</a>

                        <a href="deleteCourse?id=<%= c.getCourseId() %>"
                           class="btn btn-danger btn-sm"
                           onclick="return confirm('Are you sure you want to delete this course?')">
                           Delete
                        </a>
                    </td>
                </tr>
            <% }} %>
            </tbody>

        </table>

    </div>
</div>

</body>
</html>