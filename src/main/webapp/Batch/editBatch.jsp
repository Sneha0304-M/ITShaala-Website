<%@ page import="com.itshaala.model.Batch" %>
<%
Batch b = (Batch) request.getAttribute("batch");
%>

<h2>Edit Batch</h2>
<form action="editBatch" method="post">
<input type="hidden" name="id" value="<%= b.getBatchId() %>">

Batch Name: <input name="batchName" value="<%= b.getBatchName() %>"><br><br>
Start Date: <input type="date" name="startDate" value="<%= b.getStartDate() %>"><br><br>
End Date: <input type="date" name="endDate" value="<%= b.getEndDate() %>"><br><br>
Trainer: <input name="trainer" value="<%= b.getTrainerName() %>"><br><br>
Timing: <input name="timing" value="<%= b.getBatchTiming() %>"><br><br>
Course ID: <input name="courseId" value="<%= b.getCourseId() %>"><br><br>

<input type="submit" value="Update Batch">
</form>