package com.parithoshpoojary.user.service;

import com.parithoshpoojary.user.entity.User;
import com.parithoshpoojary.user.repository.UserRepository;
import com.parithoshpoojary.user.valueobject.Department;
import com.parithoshpoojary.user.valueobject.ResponseTempleteVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveStudent(User user) {
        log.info("Inside saveDepartment method of saveDepartment.");
        return userRepository.save(user);
    }

    public ResponseTempleteVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment method of saveDepartment.");
        ResponseTempleteVO vo = new ResponseTempleteVO();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject(
                "http://DEPARTMENT-SERVICE/departments/DeptId/" + user.getDepartmentId(),
                Department.class);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
