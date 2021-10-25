package com.parithoshpoojary.department.controller;

import com.parithoshpoojary.department.entity.Department;
import com.parithoshpoojary.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController.");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/DeptId/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside getDepartmentById method of DepartmentController.");
        return departmentService.getDepartmentById(departmentId);
    }
}
