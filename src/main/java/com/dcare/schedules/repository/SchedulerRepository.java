package com.dcare.schedules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcare.schedules.model.ScheduleModel;

public interface SchedulerRepository extends JpaRepository<ScheduleModel, Integer> 
{
	
}
