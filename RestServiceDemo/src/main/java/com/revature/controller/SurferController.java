package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Surfer;

@RestController
public class SurferController {

	@GetMapping("/allSurfers")
	public ResponseEntity<List<Surfer>> getAllSurfers() {
		List<Surfer> surfList = new ArrayList<>();
		surfList.add(new Surfer(1,"Cool Joe", 8));
		surfList.add(new Surfer(2,"Angela Merkel", 300));
		return new ResponseEntity<>(surfList, HttpStatus.OK);
	}

	//ResponseEntity is not necessary, but it's a convenient wrapper
	@RequestMapping(value = "/surferJSON", method = RequestMethod.GET, produces = "application/json")
	public Surfer getSurferJSON() {
		return new Surfer(3, "Jason", 2);
	}

	@RequestMapping(value = "/surferXML", method = RequestMethod.GET, produces = "application/xml")
	public Surfer getSurferXml() {
		return new Surfer(4, "Xavier", 3);
	}

}
