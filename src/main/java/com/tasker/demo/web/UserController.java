package com.tasker.demo.web;

import com.tasker.demo.config.constants.Constants;
import com.tasker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(Constants.USER_URLS)
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> signIn() {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> signUp() {
        return null;
    }
}
