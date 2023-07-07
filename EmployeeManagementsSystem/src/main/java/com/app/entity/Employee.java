package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="emp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "password")
public class Employee extends BaseEntity {
	@Column(length=20)
	private String fname;
	@Column(length=20)
	private String lname;
	private LocalDate jdate;
	@Column(length=20)
	private String email;
	@Column(length=20)
	private String password;
	private double salary;
	@ManyToOne
	@JoinColumn(name="deptno",nullable = false)
	private Department assignedDept;
	 
	

}
