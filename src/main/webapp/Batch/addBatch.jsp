<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Batch</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg p-4">

        <h2 class="text-center mb-4">Add New Batch</h2>

        <!-- Servlet mapping is /addBatch -->
        <form action="/addBatch" method="post">

            <div class="mb-3">
                <label class="form-label">Batch Name</label>
                <input type="text" name="batchName" class="form-control" placeholder="Java Morning Batch" required>
            </div>

            <div class="row">
                <div class="col-md-6 mb-3">
                    <label class="form-label">Start Date</label>
                    <input type="date" name="startDate" class="form-control" required>
                </div>

                <div class="col-md-6 mb-3">
                    <label class="form-label">End Date</label>
                    <input type="date" name="endDate" class="form-control" required>
                </div>
            </div>

            <div class="mb-3">
                <label class="form-label">Trainer Name</label>
                <input type="text" name="trainer" class="form-control" placeholder="Trainer Name">
            </div>

            <div class="mb-3">
                <label class="form-label">Batch Timing</label>
                <input type="text" name="timing" class="form-control" placeholder="9AM - 11AM">
            </div>

            <div class="mb-4">
                <label class="form-label">Course ID</label>
                <input type="number" name="courseId" class="form-control" placeholder="Enter Course ID">
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-success px-4">Add Batch</button>

                <!-- FIXED -->
                <a href="/dashboard" class="btn btn-secondary px-4">Back</a>
            </div>

        </form>

    </div>
</div>

</body>
</html>