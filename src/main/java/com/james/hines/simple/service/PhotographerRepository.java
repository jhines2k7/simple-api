package com.james.hines.simple.service;

import java.io.InputStream;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.james.hines.simple.model.Photographer;

@Service
public class PhotographerRepository {
    public ArrayList<Photographer> getPhotographers() {
        try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("photographers.json")) {
            // pass InputStream to JSON-Library, e.g. using Jackson
            ObjectMapper mapper = new ObjectMapper();
            PhotographerList photographer = mapper.readValue(in, PhotographerList.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
