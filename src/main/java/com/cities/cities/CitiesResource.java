package com.cities.cities;

import com.cities.cities.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CitiesResource {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public Page<City> cities(Pageable page) {
        return cityRepository.findAll(page);

    }

}
