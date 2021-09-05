package com.microservices.gateway;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.Path;

@RestController
//@RequestMapping("/users")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
//TODO - Implement circuit breakers

//    @GetMapping("/users/{id}")
//    @CircuitBreaker(name = "userServiceFallback",fallbackMethod = "userServiceFallbackMethod")
//    public Object getUserWithDepartment(@PathVariable int id){
//        Object response = restTemplate.getForObject("http://USER-SERVICE/users/"+id, Object.class);
//        return response;
//    }
//
//    @PostMapping("/users/")
//    @CircuitBreaker(name = "userServiceFallback",fallbackMethod = "userServiceFallbackMethod")
//    public Object createNewUser(){
//        Object response = restTemplate.getForObject("http://USER-SERVICE/users/", Object.class);
//        return response;
//    }
//
//    public String userServiceFallbackMethod(Exception e){
//        return "User Service is taking longer than expected, please try again";
//    }
//
//    @GetMapping("/departments/{id}")
//    @CircuitBreaker(name = "departmentServiceFallback",fallbackMethod = "departmentServiceFallbackMethod")
//    public Object getDepartment(@PathVariable int id){
//        return restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+id, Object.class);
//    }
//
//    @PostMapping("/departments/")
//    @CircuitBreaker(name = "departmentServiceFallback",fallbackMethod = "departmentServiceFallbackMethod")
//    public Object createNewDepartment(){
//        return restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/", Object.class);
//    }
//
//    public String departmentServiceFallbackMethod(Exception e){
//        return "Department Service is taking longer than expected, please try again";
//    }
}
