package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.DatabaseConnection;

import java.sql.*;
import java.util.*;

public class CourseDao {

    public void addCourse(Course course) {
        String sql = "INSERT INTO course(course_name,course_duration,course_fee) VALUES(?,?,?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, course.getCourseName());
            ps.setString(2, course.getCourseDuration());
            ps.setDouble(3, course.getCourseFee());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Course> getAllCourses() {
        List<Course> list = new ArrayList<>();
        String sql = "SELECT * FROM course";

        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Course c = new Course();
                c.setCourseId(rs.getInt("course_id"));
                c.setCourseName(rs.getString("course_name"));
                c.setCourseDuration(rs.getString("course_duration"));
                c.setCourseFee(rs.getDouble("course_fee"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void deleteCourse(int id) {
        if(id <= 0) return;   // 🔥 safety guard

        String sql = "DELETE FROM course WHERE course_id=?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Course getCourseById(int id) {
        Course c = new Course();
        String sql = "SELECT * FROM course WHERE course_id=?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c.setCourseId(rs.getInt("course_id"));
                c.setCourseName(rs.getString("course_name"));
                c.setCourseDuration(rs.getString("course_duration"));
                c.setCourseFee(rs.getDouble("course_fee"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public void updateCourse(Course c) {
        String sql = "UPDATE course SET course_name=?,course_duration=?,course_fee=? WHERE course_id=?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, c.getCourseName());
            ps.setString(2, c.getCourseDuration());
            ps.setDouble(3, c.getCourseFee());
            ps.setInt(4, c.getCourseId());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}