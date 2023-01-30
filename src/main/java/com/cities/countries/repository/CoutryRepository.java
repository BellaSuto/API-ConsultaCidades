package com.cities.countries.repository;

import com.cities.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoutryRepository extends JpaRepository <Country, Long> {
    Page<Country> findAll(Pageable page);
}
