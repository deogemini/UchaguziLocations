package com.deogemini.UchaguziLocationsApi.response;

public class CouncilResponse {

    private Long id;
    private String name;
    private String regionName;
    private Long regionId;

    private String message;

    public CouncilResponse(){}

    public CouncilResponse(Long id, String name, String regionName, Long regionId, String message) {
        this.id = id;
        this.name = name;
        this.regionName = regionName;
        this.regionId = regionId;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
