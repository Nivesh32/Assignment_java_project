package com.cll.center.callcenterproject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class DataController {

	@Autowired

	DataService dataService;

	@PostMapping("/create")

	public void create(@RequestBody Data data) {

		dataService.create(data);

	}

	@GetMapping("/get")

	public void get(@RequestParam("id") int id) {

		dataService.get(id);

	}



}
