<%@ page import="java.util.*,com.itshaala.model.Batch" %>
<%
List<Batch> list = (List<Batch>) request.getAttribute("batchList");
%>

<!DOCTYPE html>
<html>
<head>
    <title>All Batches</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow-lg p-4">
        <div class="d-flex justify-content-between mb-3">
            <h2>All Batches</h2>

            <div>
                <a href="/Batch/addBatch.jsp" class="btn btn-primary">+ Add Batch</a>
                <a href="/dashboard" class="btn btn-secondary">Dashboard</a>
            </div>
        </div>
        <table class="table table-bordered table-hover">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Batch Name</th>
                    <th>Trainer</th>
                    <th>Timing</th>
                    <th>Course</th>
                    <th>Actions</th>
                </tr>
            </thead>

           <tbody>
           <% if(list != null){
              for(Batch b : list){ %>

           <tr>
               <td><%= b.getBatchId() %></td>
               <td><%= b.getBatchName() %></td>
               <td><%= b.getTrainerName() %></td>
               <td><%= b.getBatchTiming() %></td>
               <td><%= b.getCourseName() %></td>

               <td>
                   <a href="editBatch?id=<%= b.getBatchId() %>"
                      class="btn btn-warning btn-sm">Edit</a>

                   <a href="deleteBatch?id=<%= b.getBatchId() %>"
                      class="btn btn-danger btn-sm"
                      onclick="return confirm('Delete this batch?')">
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