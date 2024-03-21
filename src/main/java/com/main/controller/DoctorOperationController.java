package com.main.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Doctor;
import com.main.services.IDoctorServiceManagement;

@RestController
@RequestMapping("/api")
public class DoctorOperationController
{
    
	@Autowired
	private IDoctorServiceManagement service;
	
	@PostMapping("/registerSingleDoctor")
	public ResponseEntity<String> registerDoctor(@RequestBody Doctor doctor)
	{
		    String msg = service.registerDoctor(doctor);
		  
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	 
	@PostMapping("/registerAllDoctors")
	public  ResponseEntity<String> registerAllDoctors(@RequestBody List<Doctor> dList) 
	{
		     String msg = service.registerAllDoctors(dList);
		     
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	@GetMapping("/getSingleDoctor/{id}")
	public  ResponseEntity<?> getDoctorById(@PathVariable Integer id)
	{
		     Optional<Doctor> op = service.getDoctorById(id);
		     
		     if(op.isPresent())
		     {
		    	Doctor d = op.get();
		    	return new ResponseEntity<Doctor>(d, HttpStatus.OK);
		     }
		     else
		    	 return new ResponseEntity<String>("Record is not found with this id-"+id, HttpStatus.OK);
	}

	@GetMapping("/getAllDoctors")
	public ResponseEntity<List<Doctor>> getAllDoctors() 
	{
		    List<Doctor> dList = service.getAllDoctors();
		    
		 return new ResponseEntity<List<Doctor>>(dList, HttpStatus.OK);
	}
    
	@DeleteMapping("/removeDoctor/{id}")
	public String removeDoctorById(@PathVariable Integer id)
	{
		 String  msg =  service.removeDoctorById(id);
		 
		 return msg;
	}
    
	@PostMapping("/getAllDoctorsByIds/{ids}")
	public ResponseEntity<List<Doctor>> getAllDoctorByIds(@RequestBody List<Integer> ids) 
	{
		        List<Doctor> dList = service.getAllDoctorByIds(ids);
		        
		return new ResponseEntity<List<Doctor>>(dList, HttpStatus.OK);
	}
}
