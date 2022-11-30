package com.example.citylist.rest.web.city.resource;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
@Builder
public class CityResponseResource {
    Long id;
    String cityName;
    String imageURL;
}
