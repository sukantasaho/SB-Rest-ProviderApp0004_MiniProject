package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name="REST_DOCTOR_PROVIDER_TAB")
@Data
public class Doctor 
{
	@Id
	@GeneratedValue
     private Integer id;
	
	
	private String docName;
	
	private Double salary;
	
	private String specialization;
}
