package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Voter;

public interface VoterRepo extends JpaRepository<Voter, Integer> {

	
	Optional<Voter> findByEmailAndPassword(String email,String password);
}
