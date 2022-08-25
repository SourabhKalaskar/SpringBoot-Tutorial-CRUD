package com.nicesystems.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicesystems.entities.Tutorial;

@Repository
public interface TutorialRepo extends JpaRepository<Tutorial, Long> {
	

}
