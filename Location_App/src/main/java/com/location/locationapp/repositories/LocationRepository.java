package com.location.locationapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.locationapp.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
