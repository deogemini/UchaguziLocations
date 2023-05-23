package com.deogemini.UchaguziLocationsApi.controller;

import com.deogemini.UchaguziLocationsApi.constant.ProjectConstant;
import com.deogemini.UchaguziLocationsApi.model.Region.Region;
import com.deogemini.UchaguziLocationsApi.request.RegionRequest;
import com.deogemini.UchaguziLocationsApi.response.RegionResponse;
import com.deogemini.UchaguziLocationsApi.service.RegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ProjectConstant.BASE_URL+"/region")
public class RegionController {
    private final RegionService regionService;

    @Autowired
    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @PostMapping
    public ResponseEntity<RegionResponse> createRegion(@RequestBody RegionRequest regionRequest) {
        // Validate the region name
        if (regionRequest.getName() == null || regionRequest.getName().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        try {
            Region region = regionService.createRegion(regionRequest);
            RegionResponse regionResponse = new RegionResponse(region.getId(), region.getName());
            return ResponseEntity.status(HttpStatus.CREATED).body(regionResponse);
        } catch (Exception e) {
            // Handle any exceptions that occur during region creation
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // Other methods for handling GET, PUT, DELETE requests can be added here
}