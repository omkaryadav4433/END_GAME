package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="dept")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department extends BaseEntity {
@Column(length=20 ,unique=true)	
private String dname;
@OneToMany(mappedBy = "assignedDept",cascade = CascadeType.ALL,orphanRemoval = true)
private List<Employee> empList=new ArrayList<>();


}
