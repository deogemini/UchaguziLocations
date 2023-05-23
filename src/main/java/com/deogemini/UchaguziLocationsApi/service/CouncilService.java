package com.deogemini.UchaguziLocationsApi.service;

import com.deogemini.UchaguziLocationsApi.model.Council.Council;
import com.deogemini.UchaguziLocationsApi.model.Region.Region;
import com.deogemini.UchaguziLocationsApi.repository.CouncilRepository;
import com.deogemini.UchaguziLocationsApi.repository.RegionRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class CouncilService {
    private final CouncilRepository councilRepository;
    private final RegionRepository regionRepository;

    public CouncilService(CouncilRepository councilRepository, RegionRepository regionRepository) {
        this.councilRepository = councilRepository;
        this.regionRepository = regionRepository;
    }

    public Region getRegionById(Long regionId) {
        // Implement the logic to retrieve the Region entity by its ID
        Optional<Region> regionOptional = regionRepository.findById(regionId);
        if (regionOptional.isEmpty()) {
            throw new EntityNotFoundException("Region not found with ID: " + regionId);
        }
        return regionOptional.get();
    }

    public void createCouncil(Council council) {
        // Implement the logic to create a new District entity
        councilRepository.save(council);
    }

    // Other methods for district-related operations
}
