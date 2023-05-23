package com.deogemini.UchaguziLocationsApi.service;

import com.deogemini.UchaguziLocationsApi.model.Region.Region;
import com.deogemini.UchaguziLocationsApi.request.RegionRequest;
import com.deogemini.UchaguziLocationsApi.repository.RegionRepository;
import org.springframework.stereotype.Service;

@Service
public class RegionService {
    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public Region createRegion(RegionRequest regionRequest) {
        Region region = new Region();
        region.setName(regionRequest.getName());

        // Additional business logic or validation

        return regionRepository.save(region);
    }
}

