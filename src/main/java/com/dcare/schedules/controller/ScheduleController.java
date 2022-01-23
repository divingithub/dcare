package com.dcare.schedules.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcare.schedules.model.ScheduleModel;
import com.dcare.schedules.repository.SchedulerRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/schedule")
public class ScheduleController {
	
	private final SchedulerRepository schedulerRepository;
	
	 @GetMapping(produces = { "application/json" }, path = "schedule")
	 public ResponseEntity<ScheduleModel> listSchedules()
	 {
		 return new ResponseEntity<>( schedulerRepository.findAll(),HttpStatus.OK);
	 }
	

}
