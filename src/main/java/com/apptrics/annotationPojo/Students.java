package com.apptrics.annotationPojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Students {

	private int ID;
	private int sAddress;
	private int sDOB;
	private String sGender;

	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Column(name = "Address" , nullable = false )
	public int getsAddress() {
		return sAddress;
	}

	public void setsAddress(int sAddress) {
		this.sAddress = sAddress;
	}

	@Column(name = "DOB", nullable = false , length = 30)
	public int getsDOB() {
		return sDOB;
	}
    
	public void setsDOB(int sDOB) {
		this.sDOB = sDOB;
	}
      
	
	@Column(name = "Gender" , nullable = false , length = 30)
	public String getsGender() {
		return sGender;
	}

	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

	@Override
	public String toString() {
		return "Students [sAddress=" + sAddress + ", sDOB=" + sDOB + ", sGender=" + sGender + "]";
	}

}
