package com.itshaala.dao;



import com.itshaala.model.Batch;
import com.itshaala.util.DatabaseConnection;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class BatchDAO {

    public void addBatch(Batch b) {
        try {
            Connection con =DatabaseConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO batch(batch_name,start_date,end_date,trainer_name,batch_timing,course_id) VALUES(?,?,?,?,?,?)"
            );

            ps.setString(1, b.getBatchName());
            ps.setDate(2, Date.valueOf(b.getStartDate()));
            ps.setDate(3, Date.valueOf(b.getEndDate()));
            ps.setString(4, b.getTrainerName());
            ps.setString(5, b.getBatchTiming());
            ps.setInt(6, b.getCourseId());

            ps.executeUpdate();

        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Batch> getAllBatches() {

        List<Batch> list = new ArrayList<>();

        try {
            Connection con = DatabaseConnection.getConnection();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT b.*, c.course_name " +
                            "FROM batch b " +
                            "LEFT JOIN course c ON b.course_id = c.course_id"
            );

            while(rs.next()) {
                Batch b = new Batch();

                b.setBatchId(rs.getInt("batch_id"));
                b.setBatchName(rs.getString("batch_name"));
                b.setStartDate(rs.getString("start_date"));   // add
                b.setEndDate(rs.getString("end_date"));       // add
                b.setTrainerName(rs.getString("trainer_name"));
                b.setBatchTiming(rs.getString("batch_timing"));
                b.setCourseId(rs.getInt("course_id"));        // ⭐ VERY IMPORTANT
                b.setCourseName(rs.getString("course_name"));

                list.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public void deleteBatch(int id) {
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps =
                    con.prepareStatement("DELETE FROM batch WHERE batch_id=?")) {

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch(Exception e){ e.printStackTrace(); }
    }

    public Batch getBatchById(int id) {
        Batch b = new Batch();
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps =
                    con.prepareStatement("SELECT * FROM batch WHERE batch_id=?")) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                b.setBatchId(rs.getInt("batch_id"));
                b.setBatchName(rs.getString("batch_name"));
                b.setStartDate(rs.getString("start_date"));
                b.setEndDate(rs.getString("end_date"));
                b.setTrainerName(rs.getString("trainer_name"));
                b.setBatchTiming(rs.getString("batch_timing"));
                b.setCourseId(rs.getInt("course_id"));
            }
        } catch(Exception e){ e.printStackTrace(); }

        return b;
    }

    public void updateBatch(Batch b) {
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE batch SET batch_name=?,start_date=?,end_date=?,trainer_name=?,batch_timing=?,course_id=? WHERE batch_id=?")) {

            ps.setString(1,b.getBatchName());
            ps.setDate(2,java.sql.Date.valueOf(b.getStartDate()));
            ps.setDate(3,java.sql.Date.valueOf(b.getEndDate()));
            ps.setString(4,b.getTrainerName());
            ps.setString(5,b.getBatchTiming());
            ps.setInt(6,b.getCourseId());
            ps.setInt(7,b.getBatchId());

            ps.executeUpdate();
        } catch(Exception e){ e.printStackTrace(); }
    }
}