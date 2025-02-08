package com.reven.request;

import com.reven.model.Address;
import com.reven.model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {

    private Long id;
    private String name;
    private Address address;
    private String description;
    private String cuisineType;
    private ContactInformation contactInformation;
    private String opningHours;
    private List<String> images;

}
