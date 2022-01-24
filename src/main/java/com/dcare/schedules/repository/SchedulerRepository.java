package com.dcare.schedules.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcare.schedules.model.ScheduleModel;

@Repository
public interface SchedulerRepository extends JpaRepository<ScheduleModel, Integer> 
{
	
}
