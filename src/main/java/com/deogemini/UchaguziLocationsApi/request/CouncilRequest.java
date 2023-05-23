package com.deogemini.UchaguziLocationsApi.request;

public class CouncilRequest {
    private String name;
    private Long regionId;

    public CouncilRequest(String name, Long regionId) {
        this.name = name;
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
}
