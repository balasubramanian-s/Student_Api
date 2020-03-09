package com.revature.student.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="created_by")
	private String createdby;
	@Column(name="modified_by")
	private String modifiedby;
	@Column(name="institution_id")
	private Integer institutionid;
	@Column(name="register_number")
	private Long redgno;
	@Column(name="first_name")
	private String fname;
	@Column(name="last_name")
	private String lname;
	@Column(name="date_of_birth")
	private Date dob;
	@Column(name="year")
	private Integer year;
	@Column(name="Mobile_number")
	private Long mobileno;
	public Long getMobileno() {
		return mobileno;
	}
	@Column(name="email")
	private String email;
	@Column(name="created_on")
	private LocalDateTime createdon;
	@Column(name="modified_on")
	private LocalDateTime modifiedon;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
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
	
	public LocalDateTime getCreatedon() {
		return createdon;
	}
	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}
	public LocalDateTime getModifiedon() {
		return modifiedon;
	}
	public void setModifiedon(LocalDateTime modifiedon) {
		this.modifiedon = modifiedon;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", createdby=" + createdby + ", modifiedby=" + modifiedby + ", institutionid="
				+ institutionid + ", redgno=" + redgno + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob
				+ ", year=" + year + ", mobileno=" + mobileno + ", email=" + email + ", createdon=" + createdon
				+ ", modifiedon=" + modifiedon + "]";
	}
	
	
	

}
