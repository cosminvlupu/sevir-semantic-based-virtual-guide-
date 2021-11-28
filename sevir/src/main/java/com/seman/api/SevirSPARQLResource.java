package com.seman.api;

import com.seman.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SevirSPARQLResource {

    @Autowired
    private LocationService locationService;

    @PostMapping
    @RequestMapping(value = "/findLocation", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    ResponseEntity <String> findLocation(@RequestBody String location) {
        return ResponseEntity.ok(locationService.dummyServiceMethod() + location);
    }

    @PostMapping
    @RequestMapping(value = "/setLocation", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    ResponseEntity <String> setLocation(@RequestBody String location) {
        return ResponseEntity.ok(locationService.dummyServiceMethod() + location);
    }
}
