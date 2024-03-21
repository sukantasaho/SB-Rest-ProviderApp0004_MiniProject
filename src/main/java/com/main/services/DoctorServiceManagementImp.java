package com.main.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Doctor;
import com.main.repository.DoctorProviderRepository;

@Service("dService")
public class DoctorServiceManagementImp implements IDoctorServiceManagement 
{
    
	@Autowired
	private DoctorProviderRepository repo;
	
	 
	public DoctorServiceManagementImp()
	{
		 System.out.println("DoctorServiceManagementImp::0-param constructor executed");
	}
	
	@Override
	public String registerDoctor(Doctor doctor)
	{
		  Doctor d = repo.save(doctor);
		  
		return "Record is created with id-"+d.getId();
	}

	@Override
	public String registerAllDoctors(List<Doctor> dList) 
	{
		     List<Doctor> list = repo.saveAll(dList);
		     List<Integer> idList = list.stream().map(e->e.getId()).collect(Collectors.toList());
		     
		return "Bulk of record is created and ids-"+idList;
	}

	@Override
	public Optional<Doctor> getDoctorById(Integer id)
	{
		      
		return repo.findById(id);
	}

	@Override
	public List<Doctor> getAllDoctors() 
	{
		 
		return repo.findAll();
	}

	@Override
	public String removeDoctorById(Integer id)
	{
		 Optional<Doctor> doctor =  repo.findById(id);
		 if(doctor.isPresent())
		 {
			 repo.deleteById(id);
			 return "Record is deleted with id-"+id;
		 }
		 else
			 return "Record is not found to delete";
	}

	@Override
	public List<Doctor> getAllDoctorByIds(List<Integer> ids) 
	{
		 
		return repo.findAllById(ids);
	}

}
