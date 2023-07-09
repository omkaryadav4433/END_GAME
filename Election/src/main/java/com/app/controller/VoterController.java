package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Voter;
import com.app.service.VoterService;
import com.app.service.VoterServiceImpl;

@RestController
@RequestMapping("/voters")
@CrossOrigin(origins="http://localhost:3000")
public class VoterController {
	
	@Autowired
	private VoterService voterServiceInstance;
	
	@PostMapping("/newvoter")
	public Voter addnewVoter(@RequestBody Voter newvoter) {
		Voter insertedVoter=voterServiceInstance.insertNewVoter(newvoter);
		
		return insertedVoter;
		
	}
	
	@PutMapping("/updatevoter")
	public Voter updatevoter(@RequestBody Voter voter) {
		Voter updateVoter= voterServiceInstance.updateVoter(voter);
		
		return updateVoter;
		
	}
	
	public String deletevoter(@PathVariable Integer voterId) {
		String deletionstatus=voterServiceInstance.deletVoter(voterId);
		
		return null;
		
	}

}
