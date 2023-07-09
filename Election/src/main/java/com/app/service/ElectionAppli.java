package com.app.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class ElectionAppli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ElectionAppli.class, args);

	}
	
	@Bean
	public ModelMapper myMapper() {
		
		ModelMapper mapper=new ModelMapper();
		
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		return mapper;
		
	}

}
