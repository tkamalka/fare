package com.cg.fare.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Fare extends Auditable<String> implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fareId;
	private int flightNumber;
	@Temporal(TemporalType.DATE)
	private Date flightDate;
	private long fare;

	public Fare() {

	}

	public Fare(int fareId, int flightNumber, Date flightDate, long fare) {
		super();
		this.fareId = fareId;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.fare = fare;
	}

	public int getFareId() {
		return fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public long getFare() {
		return fare;
	}

	public void setFare(long fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Fare [fareId=" + fareId + ", flightNumber=" + flightNumber + ", flightDate=" + flightDate + ", fare="
				+ fare + "]";
	}

	

}
