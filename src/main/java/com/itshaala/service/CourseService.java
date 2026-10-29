package com.itshaala.service;

import com.itshaala.model.Course;
import com.itshaala.dao.CourseDao;
import java.util.List;

public class CourseService {

    private CourseDao dao = new CourseDao();

    // CREATE
    public void addCourse(Course c) {
        if(c.getCourseName() == null || c.getCourseName().isEmpty()){
            throw new RuntimeException("Course name cannot be empty");
        }
        dao.addCourse(c);
    }

    // READ ALL
    public List<Course> getCourses() {
        return dao.getAllCourses();
    }

    // DELETE
    public void deleteCourse(int id) {
        dao.deleteCourse(id);
    }

    // READ BY ID (for Edit form)
    public Course getCourseById(int id) {
        return dao.getCourseById(id);
    }

    // UPDATE
    public void updateCourse(Course c) {
        dao.updateCourse(c);
    }
}