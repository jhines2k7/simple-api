package com.james.hines.simple.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Photographer {
    private String id;
    private String name;
    // private Contact contact;
    private ArrayList<String> eventTypes;
    private String avatar;
}
