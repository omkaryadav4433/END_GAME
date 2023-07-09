package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Voter;
import com.app.repository.VoterRepo;


@Service
@Transactional
public class VoterServiceImpl implements VoterService {

	@Autowired
	private VoterRepo voterrepoinstance;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public Voter insertNewVoter(Voter newVoter) {
		// TODO Auto-generated method stub
		
		Voter addedVoter=voterrepoinstance.save(newVoter);
		
		return addedVoter;
	}

	@Override
	public List<Voter> getVoterList() {
		// TODO Auto-generated method stub
		List<Voter> voterList=voterrepoinstance.findAll();
		
		return voterList;
	}

	@Override
	public Voter updateVoter(Voter voter) {
		// TODO Auto-generated method stub
		Voter updatedVoter= voterrepoinstance.save(voter);
		
		return updatedVoter;
	}

	@Override
	public String deletVoter(Integer voterID) {
		// TODO Auto-generated method stub
		String msg="voter deletion failed";
		
		if(voterrepoinstance.existsById(voterID)) {
			voterrepoinstance.deleteById(voterID);
			msg="voter Deleted successfuly";
		}
		
		return msg;
	}

}
