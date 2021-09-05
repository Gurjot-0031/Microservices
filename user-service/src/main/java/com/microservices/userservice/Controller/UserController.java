package com.microservices.userservice.Controller;

import com.microservices.userservice.Entity.User;
import com.microservices.userservice.Service.UserService;
import com.microservices.userservice.VO.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
 public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
     log.info("Inside getUserWithDepartment of UserController");
     return userService.getUserWithDepartment(userId);
 }
}
