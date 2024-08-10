package com.crud.Controller;

import com.crud.entity.Emp;
import com.crud.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private Empservice empservice;

    @GetMapping("/test")
    public String hello() {
        return "hello from controller";
    }

    @PostMapping("/add")
    public Emp addData(@RequestBody Emp emp) {
        return empservice.addData(emp);
    }

    @GetMapping("/get/{id}")
    public Optional<Emp> getById(@PathVariable("id") Long id) {
        return empservice.getById(id);
    }


}
