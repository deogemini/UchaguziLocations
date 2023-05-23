package com.deogemini.UchaguziLocationsApi.model.District;

import com.deogemini.UchaguziLocationsApi.model.Region.Region;

import javax.persistence.*;

@Entity
@Table(name="district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Many-to-one relationship with Region
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    public District(){
        //Default Constructor
    }

    public District(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
