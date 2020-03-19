package com.revature.student.service;

import java.util.List;

import com.revature.student.DTO.InsertDTO;
import com.revature.student.DTO.UpdateDTO;
import com.revature.student.model.student;
import com.revature.student.exception.ServiceException;
import com.revature.student.exception.DBException;
public interface studentservice {

	public List<student> get() throws ServiceException;
	public student get(int id)throws ServiceException;
	public void delete(int id)throws ServiceException;
	public List<student> getstudbyInst(int institutionid)throws ServiceException;
	public List<student> getstudbyInstYear(int institutionid, int year)throws ServiceException;
	public List<student> getstudbyYear(int year)throws ServiceException;
	
	public void save(InsertDTO idto)throws DBException;

	


}
