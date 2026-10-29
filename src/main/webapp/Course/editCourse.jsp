<%@ page import="com.itshaala.model.Course" %>
<%
Course c = (Course) request.getAttribute("course");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Course</title>

    <!-- Bootstrap -->
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
            <h2>✏ Edit Course</h2>
            <a href="viewCourses" class="btn btn-secondary">Back</a>
        </div>

        <form action="editCourse" method="post">

            <!-- Hidden ID -->
            <input type="hidden" name="id" value="<%= c.getCourseId() %>">

            <div class="mb-3">
                <label class="form-label">Course Name</label>
                <input type="text" name="name"
                       value="<%= c.getCourseName() %>"
                       class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Course Duration</label>
                <input type="text" name="duration"
                       value="<%= c.getCourseDuration() %>"
                       class="form-control">
            </div>

            <div class="mb-4">
                <label class="form-label">Course Fee</label>
                <input type="number" name="fee"
                       value="<%= c.getCourseFee() %>"
                       class="form-control">
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-success px-4">
                    Update Course
                </button>
            </div>

        </form>

    </div>

</div>

</body>
</html>