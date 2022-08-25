package com.nicesystems.service;

import java.util.List;

import com.nicesystems.entities.Tutorial;

public interface TutorialService {
	
	public Tutorial createTutorial(Tutorial t);

	public List<Tutorial> getAllCustomers();

}
