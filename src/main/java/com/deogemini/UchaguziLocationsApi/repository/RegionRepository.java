package com.deogemini.UchaguziLocationsApi.repository;

import com.deogemini.UchaguziLocationsApi.model.Region.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
