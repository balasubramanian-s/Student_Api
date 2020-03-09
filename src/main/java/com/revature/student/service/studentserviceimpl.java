package com.revature.student.service;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.student.DAO.studentdao;
import com.revature.student.DTO.InsertDTO;
import com.revature.student.DTO.UpdateDTO;
import com.revature.student.model.student;

@Service
public class studentserviceimpl implements studentservice {

	@Autowired
	private studentdao studdao;
	
	@Transactional
	@Override
	public List<student> get() {
		return studdao.get();
	}

	@Transactional
	@Override
	public void insert(InsertDTO idto) {
		student stud = new student();
		stud.setInstitutionid(idto.getInstitutionid());
		stud.setRedgno(idto.getRedgno());
		stud.setFname(idto.getFname());
		stud.setLname(idto.getLname());
		stud.setDob(idto.getDob());
		stud.setYear(idto.getYear());
		stud.setMobileno(idto.getMobileno());
		stud.setEmail(idto.getEmail()	);
		LocalDateTime ldt = LocalDateTime.now();
		stud.setCreatedon(ldt);
		System.out.println("Before");
		studdao.insert(stud);
		System.out.println("After");
		
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		studdao.delete(id);
		
	}

	@Override
	public List<student> getstudbyInst(int institutionid) {
		return studdao.getstudbyInst(institutionid);
	}

	@Override
	public List<student> getstudbyInstYear(int institutionid, int year) {
		return studdao.getstudbyInstYear(institutionid,year);
	}

	@Override
	public void update(UpdateDTO udto) {
		student stud = new student();
		stud.setId(udto.getId());
		stud.setInstitutionid(udto.getInstitutionid());
		stud.setRedgno(udto.getRedgno());
		stud.setFname(udto.getFname());
		stud.setLname(udto.getLname());
		stud.setDob(udto.getDob());
		stud.setYear(udto.getYear());
		stud.setMobileno(udto.getMobileno());
		stud.setEmail(udto.getEmail());
		System.out.println("Before");
		studdao.update(stud);
		System.out.println("After");		
	}



}
