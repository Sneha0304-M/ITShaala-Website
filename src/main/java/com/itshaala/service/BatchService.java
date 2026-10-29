package com.itshaala.service;

import com.itshaala.dao.BatchDAO;
import com.itshaala.model.Batch;
import java.util.List;

public class BatchService {

    BatchDAO dao = new BatchDAO();

    public void addBatch(Batch b) {
        dao.addBatch(b);
    }

    public List<Batch> getBatches() {
        return dao.getAllBatches();
    }
    public void deleteBatch(int id){
        dao.deleteBatch(id);
    }

    public Batch getBatchById(int id){
        return dao.getBatchById(id);
    }

    public void updateBatch(Batch b){
        dao.updateBatch(b);
    }
}