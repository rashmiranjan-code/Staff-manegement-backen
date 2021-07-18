package com.ascent.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ascent.crudoperation.model.Staff;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
