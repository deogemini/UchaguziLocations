package com.deogemini.UchaguziLocationsApi.controller;

import com.deogemini.UchaguziLocationsApi.constant.ProjectConstant;
import com.deogemini.UchaguziLocationsApi.model.Council.Council;
import com.deogemini.UchaguziLocationsApi.model.Region.Region;
import com.deogemini.UchaguziLocationsApi.request.CouncilRequest;
import com.deogemini.UchaguziLocationsApi.response.CouncilResponse;
import com.deogemini.UchaguziLocationsApi.service.CouncilService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ProjectConstant.BASE_URL+"/council")
public class CouncilController {
    private final CouncilService councilService;

    public CouncilController(CouncilService councilService) {
        this.councilService = councilService;
    }

    @PostMapping
    public ResponseEntity<CouncilResponse> createCouncil(@RequestBody CouncilRequest councilRequest) {
        // Create a new Council entity using the data from the councilRequest object
        Council council = new Council();
        council.setName(councilRequest.getName());

        // Retrieve the Region entity using the regionId from the councilRequest object
        Region region = councilService.getRegionById(councilRequest.getRegionId());
        council.setRegion(region);

        // Save the council entity using the councilService
        councilService.createCouncil(council);

        //create the councilResponse object with the newly created council information
        CouncilResponse councilResponse = new CouncilResponse();
        councilResponse.setId(council.getId());
        councilResponse.setName(council.getName());
        councilResponse.setRegionId(region.getId());
        councilResponse.setRegionName(region.getName());

        councilResponse.setMessage("Council created successful");


        return ResponseEntity.status(HttpStatus.CREATED).body(councilResponse);
    }
}
