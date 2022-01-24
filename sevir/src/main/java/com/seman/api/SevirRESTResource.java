package com.seman.api;

import com.seman.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log4j2
@Controller
public class SevirRESTResource {
    @Autowired
    private UserService userService;

    @PostMapping
    @RequestMapping(value = "/login", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    ResponseEntity <String> login(@RequestBody LoginForm loginForm) {
        return ResponseEntity.ok(userService.dummyServiceMethod() + " with login.");
    }

    @PostMapping
    @RequestMapping(value = "/register", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    ResponseEntity <String> register(@RequestBody RegisterForm registerForm) {
        return ResponseEntity.ok(userService.dummyServiceMethod() + " with register.");
    }

    @PostMapping
    @RequestMapping(value = "/logout", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    ResponseEntity <String> logout(@RequestBody String projects) {
        return ResponseEntity.ok(userService.dummyServiceMethod() + " with logout.");
    }
}
