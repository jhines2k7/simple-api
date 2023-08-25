package com.james.hines.simple.controller;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.hines.simple.model.Photographer;
import com.james.hines.simple.service.PhotographerService;

import lombok.RequiredArgsConstructor;

@RestController("/api/photographers")
@RequiredArgsConstructor
public class SimpleController {
    private final PhotographerService photographerService;

    @GetMapping
    public ArrayList<Photographer> getPhotographers() {
        ArrayList<Photographer> photographers = photographerService.getPhotographers();

        return photographers;
    }

    @GetMapping("/{id}")
    public Photographer getPhotographer(String id) {
        Photographer photographer = photographerService.getPhotographer(id);

        return photographer;
    }
}
