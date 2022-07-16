package net.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DataSiswaService {

    @Autowired
    private DataSiswaRepository repo;

    public List<datasiswa> listAll() {
        return repo.findAll();
    }

    public void save(datasiswa datasiswa) {
        repo.save(datasiswa);
    }

    public datasiswa get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}