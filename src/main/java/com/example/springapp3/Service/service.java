package com.example.springapp3.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp3.Entity.model;
import com.example.springapp3.Repository.repository;

@Service
public class service {
	
	@Autowired
	repository erepo;
	
	public model saveDetails(model e)
	{
		
	return erepo.save(e);
	}
    public List<model> getDetails()
    {
    	return erepo.findAll();
    }
   
}