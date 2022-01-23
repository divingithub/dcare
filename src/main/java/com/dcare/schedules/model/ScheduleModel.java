package com.dcare.schedules.model;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleModel {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11, updatable = false, nullable = false)
	private int id;
	
	@Column(length = 3)
	private String tocken_prefix;
	
	@Column(length = 6)
	private String tocken;
	
	private Timestamp startDateTime;
	private Timestamp endDateTime;

	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date date;
	
	private LocalTime startTime;
	private LocalTime endTime;
	
	@CreationTimestamp
	@DateTimeFormat(pattern="dd/MM/yyyy")
    @Column(updatable = false)
	private Date created_at;
	
	@CreationTimestamp
	@DateTimeFormat(pattern="dd/MM/yyyy")
	
	private Date updated_at;
	private boolean is_deleted = false;
	private String reason;
	
	@Column(length = 11, nullable = false)
	private int organization;
	@Column(length = 11, nullable = false)
	private int doctor;
	@Column(length = 11, nullable = false)
	private int department;
	
}
