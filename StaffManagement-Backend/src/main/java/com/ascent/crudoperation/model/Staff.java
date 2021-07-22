package com.ascent.crudoperation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STFF_DTLS")
public class Staff {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="staff_Id",length = 5)
	private Integer staffId;
	@Column(name="Staff_name",length = 25)
	private String staffName;
	@Column(name="Staff_email",length = 25)
	private String staffEmailId;
	@Column(name="Staff_phone",length = 13)
	private String staffPhoneNumber;
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffEmailId() {
		return staffEmailId;
	}
	public void setStaffEmailId(String staffEmailId) {
		this.staffEmailId = staffEmailId;
	}
	public String getStaffPhoneNumber() {
		return staffPhoneNumber;
	}
	public void setStaffPhoneNumber(String staffPhoneNumber) {
		this.staffPhoneNumber = staffPhoneNumber;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffEmailId=" + staffEmailId
				+ ", staffPhoneNumber=" + staffPhoneNumber + "]";
	}
	
	
	

}
