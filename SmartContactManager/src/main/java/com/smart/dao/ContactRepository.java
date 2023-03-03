package com.smart.dao;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{

	//pegination...
	
	//currentPage-page 
	//Contact Per page - 5
	@Query("from Contact as c where c.user.id=:userId") 
	public Page<Contact> findContactsByUser(@Param("userId")int userId,PageRequest pageRequest);
	
	
	
	
}
