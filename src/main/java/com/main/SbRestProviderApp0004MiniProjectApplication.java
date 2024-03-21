package com.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.entity.Doctor;
import com.main.services.IDoctorServiceManagement;

@SpringBootApplication
public class SbRestProviderApp0004MiniProjectApplication 
{

	public static void main(String[] args) 
	{
		  SpringApplication.run(SbRestProviderApp0004MiniProjectApplication.class, args);
		    //IDoctorServiceManagement service = ctx.getBean("dService", IDoctorServiceManagement.class);
		    //register single doctor service
			/*
			 * Doctor d = new Doctor();
			 * d.setDocName("Sukanta");d.setSalary(30000d);d.setSpecialization("Nurology");
			 * System.out.println(service.registerDoctor(d));
			 */
		    
		    //register bulk of doctor service
			/*
			 * Doctor d1 = new Doctor();
			 * d1.setDocName("Raja");d1.setSalary(5000d);d1.setSpecialization("Urology");
			 * Doctor d2 = new Doctor();
			 * d2.setDocName("Amit");d2.setSalary(40000d);d2.setSpecialization("Sexology");
			 * Doctor d3 = new Doctor();
			 * d3.setDocName("Rajendra");d3.setSalary(80000d);d3.setSpecialization(
			 * "Gastronology");
			 * System.out.println(service.registerAllDoctors(List.of(d1,d2,d3)));
			 */
		    
		    //get single doctor service by id
			/*
			 * Doctor d = service.getDoctorById(3).get();
			 * System.out.println(d.getDocName()+" "+d.getSalary());
			 */
		    
		    //get all doctors by ids
			/*
			 * List<Doctor> dList = service.getAllDoctorByIds(List.of(2,3,4));
			 * dList.forEach(e->System.out.println(e.getDocName()+"  "+e.getSpecialization()
			 * +"  "+e.getSalary()));
			 */
		    
			/*
			 * service.getAllDoctors().forEach(d->System.out.println(d.getId()+"  "+d.
			 * getDocName()));;
			 */
		    
		    
	}

}
