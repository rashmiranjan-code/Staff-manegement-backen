package com.ascent.crudoperation.service;

import java.util.List;
import java.util.Optional;

import com.ascent.crudoperation.model.Staff;

public interface StaffService {
	public boolean saveStaff(Staff staff);
	public boolean updateStaff(Staff staff);
	public List<Staff> getAllStaff();
	public boolean deleteStaffById(Integer staffId);
	public Optional<Staff> getStaffById(Integer staffId);

}
