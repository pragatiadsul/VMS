package com.visitor.vmsvisitorservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.visitor.vmsvisitorservice.dto.VisitorDto;
import com.visitor.vmsvisitorservice.model.Visitor;

public interface IVisitorService {

	String addVisitor(VisitorDto visitorDto);

	List<Visitor> visitorList();

	Visitor GetByIdIn(long id);

	//ResponseEntity<Visitor> GetByIdIn(Integer id);

	//Visitor getVisitorById(long id);

}
