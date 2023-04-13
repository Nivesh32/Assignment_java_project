package com.cll.center.callcenterproject;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface DataRepo extends JpaRepository<Data, Integer> {



}
