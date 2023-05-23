package com.deogemini.UchaguziLocationsApi.repository;

import com.deogemini.UchaguziLocationsApi.model.District.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository<District, Long> {
}
