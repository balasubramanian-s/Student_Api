package com.revature.student.DAO;

import java.util.List;

import com.revature.student.model.student;

public interface studentdao {

	public List<student> get();
	
	public student get(int id);
	
	public void insert(student stud);

	public  void delete(int id);

	public List<student> getstudbyInst(int institutionid);

	public List<student> getstudbyInstYear(int institutionid, int year);
	
	public List<student> getstudbyYear(int year);

	public void update(student stud);

		
		

}
