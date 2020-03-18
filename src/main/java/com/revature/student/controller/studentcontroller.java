package com.revature.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.student.DTO.InsertDTO;
import com.revature.student.DTO.UpdateDTO;
import com.revature.student.model.student;
import com.revature.student.service.studentservice;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class studentcontroller {
	@Autowired 
	private studentservice studservice;
	
	@GetMapping("/getall")
	public List<student>get(){
		return studservice.get();
	}
	@GetMapping("/get/{id}")
	public student get(@PathVariable Integer id) {
		return studservice.get(id);
	}
	
	@GetMapping("/institution/{inst_id}")
	public List<student>getstudbyInst(@PathVariable int inst_id) {
		
		return studservice.getstudbyInst(inst_id);
	}
	
	@GetMapping("/year/{institutionid}/{year}")
	public List<student>getstudbyInstYear(@PathVariable int institutionid,@PathVariable int year){
		return studservice.getstudbyInstYear(institutionid,year);
	}
	@GetMapping("/year/{year}")
	public List<student>getstudbyYear(@PathVariable int year){
		return studservice.getstudbyYear(year);
	}
	@PostMapping("/addStudent")
	public void save(@RequestBody InsertDTO idto) {
		studservice.save(idto);
	}
	
	@PutMapping("/updateStudent")
	public void update(@RequestBody InsertDTO udto) {
		studservice.save(udto);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		studservice.delete(id);
		//return "Student of "+id+" deleted";
		
	}

}
