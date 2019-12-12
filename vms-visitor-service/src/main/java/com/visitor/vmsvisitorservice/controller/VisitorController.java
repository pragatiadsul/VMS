package com.visitor.vmsvisitorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.visitor.vmsvisitorservice.dto.VisitorDto;
import com.visitor.vmsvisitorservice.model.Visitor;
import com.visitor.vmsvisitorservice.service.IVisitorService;


@RestController
@RequestMapping("/visitor")
public class VisitorController {

	@Autowired
	private IVisitorService visitorService;
	
	@PostMapping("/addVisitor")
	public ResponseEntity<String> addVisitor(@RequestBody VisitorDto visitorDto) {
		return new ResponseEntity<String>(visitorService.addVisitor(visitorDto), HttpStatus.OK);
	}
	@GetMapping("/visitorList")
	public List<Visitor> usersList() {
		return visitorService.visitorList();
	}


	
	
	@GetMapping("/visitorList/{id}")
	public Visitor GetByIdIn(@PathVariable long id)
	{
		return visitorService.GetByIdIn(id);
	}
	
}
