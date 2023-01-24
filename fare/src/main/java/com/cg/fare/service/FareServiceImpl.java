package com.cg.fare.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fare.entity.Fare;
import com.cg.fare.repository.FareDao;

@Service
public class FareServiceImpl implements FareService {
	@Autowired
	FareDao fareDao;

	@Override
	public Fare getFare(int flightNumber, Date flightDate) {
		return fareDao.findByFlightNumberAndFlightDate(flightNumber, flightDate);
	}

	@Override
	public Fare postFare(Fare fare) {
		return fareDao.save(fare);
	}

}
