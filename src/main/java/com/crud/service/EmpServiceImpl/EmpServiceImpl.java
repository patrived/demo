package com.crud.service.EmpServiceImpl;

import com.crud.Repo.EmpRepo;
import com.crud.entity.Emp;
import com.crud.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmpServiceImpl implements Empservice {
    @Autowired
    EmpRepo empRepo ;
    @Override
    public Emp addData(Emp emp) {
        return   empRepo.save(emp);

    }

    @Override
    public Optional<Emp> getById(Long id) {

        Optional<Emp> emp = empRepo.findById(id);

         return Optional.of(emp.get());
    }
}
