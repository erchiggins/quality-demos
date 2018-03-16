package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Surfer;

@RestController 
public class SurferController {
	
	@GetMapping("/surfer/all")
	public ResponseEntity<List<Surfer>> getAllSurfers(){
		List<Surfer> surfList = new ArrayList<>();
		surfList.add(new Surfer("Cool Joe",8));
		surfList.add(new Surfer("Angela Merkel",300));
		return new ResponseEntity<>(surfList,HttpStatus.OK);
	}

}
