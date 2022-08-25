package com.nicesystems.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicesystems.entities.Tutorial;
import com.nicesystems.repo.TutorialRepo;
import com.nicesystems.service.TutorialService;
@Service
public class TutorialServiceImpl implements TutorialService {
	@Autowired
	private TutorialRepo tRepo;
	
	@Override
	public Tutorial createTutorial(Tutorial t) {

		return tRepo.save(t);
	}

	@Override
	public List<Tutorial> getAllCustomers() {
		
		return tRepo.findAll();
	}

}
