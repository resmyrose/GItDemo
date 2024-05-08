package com.resmy.demos.onlineexam.controller;

import com.resmy.demos.onlineexam.resource.User;
import com.resmy.demos.onlineexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping(value="/users")
    public ResponseEntity<User> createUser(@RequestBody User requestBody) {
      // call service method
        return ResponseEntity.created()
                .body(new User());
                //.header("Custom-Header", "foo")

    }
}
