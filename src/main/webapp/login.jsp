<%@ page contentType="text/html;charset=UTF-8" %>


<!DOCTYPE html>
<html>
<head>
<title>IT-Shaala Admin</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{background:#f4f7fb;font-family:Segoe UI;}

.hero{
    background:linear-gradient(120deg,#4facfe,#00c6ff);
    color:white;
    padding:60px 40px;
    border-radius:20px;
}

.stat-card{
    border:none;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.08);
    transition:.3s;
}
.stat-card:hover{transform:translateY(-5px);}

.feature-card{
    border:none;
    border-radius:18px;
    box-shadow:0 8px 20px rgba(0,0,0,0.07);
    transition:.3s;
}
.feature-card:hover{transform:scale(1.03);}
</style>
</head>

<body>

<div class="container mt-4">

<!-- HERO -->
<div class="hero mb-5">
    <h1>Welcome Admin 👋</h1>
    <p>Manage Courses & Batches of IT-Shaala Training Institute</p>
</div>

<!-- STATS -->
<div class="row text-center mb-5">
    <div class="col-md-4">
        <div class="card stat-card p-4">
            <h2>7+</h2>
            <p>Total Courses</p>
        </div>
    </div>

    <div class="col-md-4">
        <div class="card stat-card p-4">
            <h2>20+</h2>
            <p>Total Batches</p>
        </div>
    </div>

    <div class="col-md-4">
        <div class="card stat-card p-4">
            <h2>500+</h2>
            <p>Students</p>
        </div>
    </div>
</div>

<!-- FEATURES -->
<h3 class="mb-4">Management Panel</h3>

<div class="row">

    <div class="col-md-3">
        <div class="card feature-card p-4 text-center">
            <h4>📘 Add Course</h4>
            <a href="addCourse.jsp" class="btn btn-primary mt-3">Open</a>
        </div>
    </div>

    <div class="col-md-3">
        <div class="card feature-card p-4 text-center">
            <h4>📋 View Courses</h4>
            <a href="viewCourses" class="btn btn-success mt-3">Open</a>
        </div>
    </div>

    <div class="col-md-3">
        <div class="card feature-card p-4 text-center">
            <h4>📚 Add Batch</h4>
            <a href="addBatch.jsp" class="btn btn-warning mt-3">Open</a>
        </div>
    </div>

    <div class="col-md-3">
        <div class="card feature-card p-4 text-center">
            <h4>📝 View Batches</h4>
            <a href="viewBatches" class="btn btn-dark mt-3">Open</a>
        </div>
    </div>

</div>

</div>
</body>
</html>