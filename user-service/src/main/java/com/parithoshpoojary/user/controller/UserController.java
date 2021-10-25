package com.parithoshpoojary.user.controller;

import com.parithoshpoojary.user.entity.User;
import com.parithoshpoojary.user.service.UserService;
import com.parithoshpoojary.user.valueobject.ResponseTempleteVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveStudent(@RequestBody User user){
        log.info("Inside saveDepartment method of DepartmentController.");
        return userService.saveStudent(user);
    }

    @GetMapping("/{id}")
    public ResponseTempleteVO getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }

}
