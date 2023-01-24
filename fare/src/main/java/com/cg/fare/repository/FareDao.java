package com.cg.fare.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fare.entity.Fare;

@Repository
public interface FareDao extends JpaRepository<Fare, Integer> {
	public Fare findByFlightNumberAndFlightDate(int flightNumber, Date flightDate);

}
