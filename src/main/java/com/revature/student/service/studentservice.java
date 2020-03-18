package com.revature.student.service;

import java.util.List;

import com.revature.student.DTO.InsertDTO;
import com.revature.student.DTO.UpdateDTO;
import com.revature.student.model.student;

public interface studentservice {

	public List<student> get();
	public student get(int id);
	public void delete(int id);
	public List<student> getstudbyInst(int institutionid);
	public List<student> getstudbyInstYear(int institutionid, int year);
	public List<student> getstudbyYear(int year);
	public void update(UpdateDTO udto);
	public void save(InsertDTO idto);

	


}
