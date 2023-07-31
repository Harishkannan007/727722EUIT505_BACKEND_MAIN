package com.example.springapp3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp3.Entity.model;

public interface repository extends JpaRepository<model,Integer>{

}