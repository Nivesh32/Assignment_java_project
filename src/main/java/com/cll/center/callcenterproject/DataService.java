package com.cll.center.callcenterproject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service

public class DataService {

  @Autowired

  DataRepo dataRepo;

	public void create(Data data) {

		

		dataRepo.save(data);

	}

	public Data get(int id) {

		return dataRepo.findById(id).orElse(null);

		

	}



}
