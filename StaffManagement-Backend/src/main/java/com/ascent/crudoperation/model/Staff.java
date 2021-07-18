package com.ascent.crudoperation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STFF_DTLS")
public class Staff {
	@Id
	@Column(name="Id")
	private Integer staffId;
	@Column(name="Staff_name")
	private String staffName;
	@Column(name="Staff_email")
	private String staffEmailId;
	@Column(name="Staff_phone")
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
