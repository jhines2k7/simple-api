package com.james.hines.simple.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.james.hines.simple.model.Photographer;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PhotographerService {
    private final PhotographerRepository photographerRepository;

    public ArrayList<Photographer> getPhotographers() {
        // load json file
        ArrayList<Photographer> photographers = photographerRepository.getPhotographers();
        // convert json to list of photographers
        

        return null;
    }

    public Photographer getPhotographer(String id) {
        ArrayList<Photographer> photographers = getPhotographers();

        Photographer photographer = photographers.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst()
            .orElse(null);
        // find photographer with id

        return photographer;
    }
}
