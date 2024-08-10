package com.crud.service;

import com.crud.entity.Emp;

import java.util.Optional;

public interface Empservice {

   Emp addData(Emp emp);
   Optional<Emp> getById(Long id);
}
