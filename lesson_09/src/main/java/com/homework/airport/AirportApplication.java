package com.homework.airport;

import com.homework.airport.controllers.AirportsController;
import com.homework.airport.domain.Airport;

import static com.homework.airport.AirportFactory.getAirport;
import static java.util.Arrays.asList;

public class AirportApplication {

	public static void main(String[] args) {
		final Airport kbp = getAirport("KBP");
		final Airport dubai = getAirport("Dubai");
		final Airport shopin = getAirport("Shopin");
		final AirportsController airportsController = new AirportsController();
		airportsController.register(asList(kbp, dubai, shopin));

		airportsController.start();
	}


}
