package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/year/{year}")
    public List<Whisky> findWhiskiesByYear(@PathVariable int year) {
        return whiskyRepository.findWhiskiesByYear(year);
    }

    @GetMapping(value = "/age/{age}/distillery/{distilleryId}")
        public List<Whisky> findWhiskiesByAgeAndDistilleryId(@PathVariable int age, @PathVariable long distilleryId) {
            return whiskyRepository.findWhiskiesByAgeAndDistilleryId(age, distilleryId);
    }

    @GetMapping(value = "/region/{region}")
    public List<Whisky> findWhiskiesByDistilleryRegion(@PathVariable String region) {
        return whiskyRepository.findWhiskiesByDistilleryRegion(region);
    }

}


