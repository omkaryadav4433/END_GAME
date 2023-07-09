package com.app.service;

import java.util.List;

import com.app.entity.Voter;

public interface VoterService {
	
	Voter insertNewVoter(Voter newVoter);
	
	
	List<Voter> getVoterList();
	
	
	Voter updateVoter(Voter voter);
	
	String deletVoter(Integer voterID);
	
	
	//RespVoterDTO authenicateVoter(ReqVoterDTO reqvoterdto);
	

}
