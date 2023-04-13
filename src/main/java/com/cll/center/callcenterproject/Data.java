package com.cll.center.callcenterproject;

import javax.persistence.Entity;



import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import lombok.AllArgsConstructor;

import lombok.Builder;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;



@Getter

@Setter

@Builder

@NoArgsConstructor

@AllArgsConstructor

@Entity

public class Data {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	private String from_number;

	private String start_time;

	private String end_time;

	



}
