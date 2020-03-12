package com.revature.student.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.student.DAO.studentdao;
import com.revature.student.DTO.InsertDTO;
import com.revature.student.DTO.UpdateDTO;
import com.revature.student.model.Organization;
import com.revature.student.model.student;

@Service
public class studentserviceimpl implements studentservice {

	@Autowired
	private studentdao studdao;

	private Organization org = new Organization();
	

	@Transactional
	@Override
	public List<student> get() {
		return studdao.get();
	}

	@Transactional
	@Override
	public void insert(InsertDTO idto) {
		Organization org = new Organization();
		student stud = new student();
		org.setId(idto.getInstitutionid());
		stud.setOrg(org);
		stud.setRedgno(idto.getRedgno());
		stud.setFname(idto.getFname());
		stud.setLname(idto.getLname());
		stud.setDob(idto.getDob());
		stud.setYear(idto.getYear());
		stud.setMobileno(idto.getMobileno());
		stud.setEmail(idto.getEmail());
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

	@Transactional
	@Override
	public List<student> getstudbyInst(int institutionid) {
		return studdao.getstudbyInst(institutionid);
	}

	@Transactional
	@Override
	public List<student> getstudbyInstYear(int institutionid, int year) {
		return studdao.getstudbyInstYear(institutionid, year);
	}

	@Transactional
	@Override
	public void update(UpdateDTO udto) {
		Organization org = new Organization();
		student stud = get(udto.getId());
		org.setId(udto.getInstitutionid());
		stud.setId(udto.getId());
		stud.setOrg(org);
		stud.setRedgno(udto.getRedgno());
		stud.setFname(udto.getFname());
		stud.setLname(udto.getLname());
		stud.setDob(udto.getDob());
		stud.setYear(udto.getYear());
		stud.setMobileno(udto.getMobileno());
		stud.setEmail(udto.getEmail());
		stud.setModifiedon(udto.getModifiedon());
		System.out.println("Before");
		studdao.insert(stud);
		System.out.println("After");
	}

	@Override
	public student get(int id) {
		
		return studdao.get(id);
	}

}
