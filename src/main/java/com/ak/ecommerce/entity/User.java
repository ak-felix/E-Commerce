package com.ak.ecommerce.entity;

import com.ak.ecommerce.enums.UserRole;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ecomusers")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	
	private String password;
	
	private String name;
	
	private UserRole role;
	
	@Lob
	@Column(columnDefinition = "longblob")
	private byte[] img;
}
