package com.revature.student.DTO;

import java.sql.Date;
import java.time.LocalDateTime;

public class InsertDTO {
	private Integer institutionid;
	private Long redgno;
	private String fname;
	private String lname;
	private Date dob;
	private Integer year;
	private Long mobileno;
	private String email;

	public Integer getInstitutionid() {
		return institutionid;
	}
	public void setInstitutionid(Integer institutionid) {
		this.institutionid = institutionid;
	}
	public Long getRedgno() {
		return redgno;
	}
	public void setRedgno(Long redgno) {
		this.redgno = redgno;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
