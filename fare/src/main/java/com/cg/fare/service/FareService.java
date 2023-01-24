package com.cg.fare.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.cg.fare.entity.Fare;

@Service
public interface FareService {

	Fare getFare(int flightNumber, Date flightDate);

	Fare postFare(Fare fare);

}
