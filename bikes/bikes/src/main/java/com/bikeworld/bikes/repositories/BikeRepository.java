package com.bikeworld.bikes.repositories;

import com.bikeworld.bikes.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
