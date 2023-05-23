package com.deogemini.UchaguziLocationsApi.request;
public class RegionRequest {
    private String name;

    // Constructors, getters, and setters

    public RegionRequest() {
        // Default constructor
    }

    public RegionRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
