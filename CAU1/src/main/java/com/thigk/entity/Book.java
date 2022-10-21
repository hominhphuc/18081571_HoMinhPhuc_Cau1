package com.thigk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SubId;
	
	private String name;
	
	private String creadit;
	
	
	
}
