package com.nicesystems.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nicesystems.entities.Tutorial;
import com.nicesystems.service.TutorialService;

@RestController
public class TutorialRestController {

	@Autowired
	private TutorialService tService;

	@PostMapping(value="/createTutorial", consumes={"application/json", "application/xml"})
	public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial t) {
		
		Tutorial createTutorial = tService.createTutorial(t);

		return new ResponseEntity<>(createTutorial, HttpStatus.CREATED);
	}

	@GetMapping(value="/getAllTutorials", produces= {"application/json", "application/xml"})
	public ResponseEntity<List<Tutorial>> getAllCustomers() {

		List<Tutorial> allCustomers = tService.getAllCustomers();
		return new ResponseEntity<>(allCustomers, HttpStatus.OK);
	}
}
