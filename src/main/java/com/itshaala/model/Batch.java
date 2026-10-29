package com.itshaala.model;



public class Batch {

    private int batchId;
    private String batchName;
    private String startDate;
    private String endDate;
    private String trainerName;
    private String batchTiming;
    private int courseId;
    private String courseName; // for JOIN

    // getters & setters
    public int getBatchId() { return batchId; }
    public void setBatchId(int batchId) { this.batchId = batchId; }

    public String getBatchName() { return batchName; }
    public void setBatchName(String batchName) { this.batchName = batchName; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public String getTrainerName() { return trainerName; }
    public void setTrainerName(String trainerName) { this.trainerName = trainerName; }

    public String getBatchTiming() { return batchTiming; }
    public void setBatchTiming(String batchTiming) { this.batchTiming = batchTiming; }

    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
}