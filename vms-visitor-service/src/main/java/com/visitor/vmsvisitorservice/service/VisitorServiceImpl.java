package com.visitor.vmsvisitorservice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.visitor.vmsvisitorservice.dto.VisitorDto;
import com.visitor.vmsvisitorservice.model.Visitor;
import com.visitor.vmsvisitorservice.repository.VisitorRepository;

@Service
public class VisitorServiceImpl implements IVisitorService{
	
	@Autowired
	private VisitorRepository visitorRepository;

	@Override
	public String addVisitor(VisitorDto visitorDto) {
		// TODO Auto-generated method stub
		
		Visitor va = new Visitor();
		va.setAddress(visitorDto.getAddress());
		va.setCity(visitorDto.getCity());
		va.setContactPersonEmail(visitorDto.getContactPersonEmail());
		va.setContactPersonName(visitorDto.getContactPersonName());
		va.setCountry(visitorDto.getCountry());
		va.setEmail(visitorDto.getEmail());
		va.setId(visitorDto.getId());
		va.setIdProof(visitorDto.getIdProof());
		va.setMobileNo(visitorDto.getMobileNo());
		va.setName(visitorDto.getName());
		va.setReasonForVisit(visitorDto.getReasonForVisit());
		va.setReference(visitorDto.getReference());
		va.setState(visitorDto.getState());
	    visitorRepository.save(va);
		return "Recored Added successfully";
		

	}

	@Override
	public List<Visitor> visitorList() {
		// TODO Auto-generated method stub
		return visitorRepository.findAll();
	}

	@Override
	public Visitor GetByIdIn(long id) {
		// TODO Auto-generated method stub
		return visitorRepository.findById(id);
	}

//	@Override
//	public Visitor getVisitorById(long id) {
//		
//		return visitorRepository.findByVisitorId(id);
//	}

}
