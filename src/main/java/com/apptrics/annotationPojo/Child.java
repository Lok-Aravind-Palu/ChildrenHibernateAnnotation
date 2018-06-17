package com.apptrics.annotationPojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "child")
public class Child {

	private int cRollNo;
	private int childClass;
	private String cSection;
	private int cAge;
	private Set<Students> stu ;
	
	
	@OneToMany(fetch = FetchType.LAZY)
	public Set<Students> getStu() {
		return stu;
	}
	public void setStu(Set<Students> stu) {
		this.stu = stu;
	}
	@Id
	@GeneratedValue
	@Column(name = "RollNo"  , nullable = false , length = 50)
	public int getcRollNo() {
		return cRollNo;
	}
	public void setcRollNo(int cRollNo) {
		this.cRollNo = cRollNo;
	}
	
	@Column(name = "ChildClass" , nullable = false , length =40 )
	public int getChildClass() {
		return childClass;
	}
	public void setChildClass(int childClass) {
		this.childClass = childClass;
	}
	
	@Column(name = "ChildSection" , nullable = false , length = 50)
	public String getcSection() {
		return cSection;
	}
	public void setcSection(String cSection) {
		this.cSection = cSection;
	}
	
	@Column(name = "ChildAge" , nullable = false , length =50)
	public int getcAge() {
		return cAge;
	}
	public void setcAge(int cAge) {
		this.cAge = cAge;
	}
	
	
	@Override
	public String toString() {
		return "Child [cRollNo=" + cRollNo + ", childClass=" + childClass + ", cSection=" + cSection + ", cAge=" + cAge
				+ "]";
	}
	
	

}
