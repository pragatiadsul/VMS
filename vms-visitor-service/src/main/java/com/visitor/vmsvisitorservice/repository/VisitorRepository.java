package com.visitor.vmsvisitorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;


import com.visitor.vmsvisitorservice.model.Visitor;
@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long> {

	Visitor findById(long id);
	
}
