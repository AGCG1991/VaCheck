package vacheck.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vacheck.demo.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	
	
}