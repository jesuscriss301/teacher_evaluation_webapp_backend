package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class Usuario {
	@Id
        @Column(name = "id")
	@SequenceGenerator(name="id", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id")
	private Integer id;
	@Column(name = "user_name")
	private String user_name;
        @Column(name = "user_code")
        private Integer user_code;
        @Column(name = "identity_card_number")
        private Integer identify_card_number;
	@Column(name = "email")
	private String email;
        @Column(name = "password")
        private String password;
        @Column(name = "is_admin")
        private Boolean is_admin;
}
