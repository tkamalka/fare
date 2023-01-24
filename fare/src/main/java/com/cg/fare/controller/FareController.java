package com.cg.fare.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fare.entity.Fare;
import com.cg.fare.service.FareService;

@RestController
@RequestMapping(value = "/fares")
public class FareController {
	@Autowired
	FareService fareService;

	// Display fare based on "flightNumber" and "flightDate"
	@GetMapping(value = "/fare/get/{flightNumber}/{flightDate}")
	public Fare getFare(@PathVariable int flightNumber,
			@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable Date flightDate) {
		return fareService.getFare(flightNumber, flightDate);

	}

	// "ADD" a new fare
	@PostMapping(value = "/fare")
	public Fare postFare(@RequestBody Fare fare) {
		return fareService.postFare(fare);
	}

}
