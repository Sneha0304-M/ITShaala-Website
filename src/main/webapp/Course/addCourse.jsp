<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Course</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow p-4">
        <h2 class="text-center mb-4">Add New Course</h2>

        <!-- Servlet mapping is /addCourse -->
        <form action="/addCourse" method="post">

            <div class="mb-3">
                <label class="form-label">Course Name</label>
                <input type="text" name="name" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Course Duration</label>
                <input type="text" name="duration" class="form-control" placeholder="6 Months">
            </div>

            <div class="mb-3">
                <label class="form-label">Course Fee</label>
                <input type="number" name="fee" class="form-control">
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Add Course</button>

                <!-- go to dashboard servlet -->
                <a href="/dashboard" class="btn btn-secondary">Back</a>
            </div>

        </form>
    </div>
</div>

</body>
</html>