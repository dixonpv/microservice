package com.dixon.userservice.controller;

import com.dixon.userservice.entity.User;
import com.dixon.userservice.service.UserService;
import com.dixon.userservice.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {

      log.info("Inside save user controller");
      return userService.saveUser(user);

    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {

        log.info("Inside get User With Department controller");
        return userService.getUserWithDepartment(userId);

    }
}
