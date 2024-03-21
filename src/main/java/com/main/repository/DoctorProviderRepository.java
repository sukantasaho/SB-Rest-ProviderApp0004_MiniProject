package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Doctor;

public interface DoctorProviderRepository extends JpaRepository<Doctor, Integer> 
{
     
}
