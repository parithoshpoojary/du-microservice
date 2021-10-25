package com.parithoshpoojary.department.service;

import com.parithoshpoojary.department.entity.Department;
import com.parithoshpoojary.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of saveDepartment.");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("Inside getDepartmentById method of DepartmentService.");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
