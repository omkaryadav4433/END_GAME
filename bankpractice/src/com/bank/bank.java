package com.bank;

import java.io.Serializable;
import java.time.LocalDate;

public class bank implements Serializable{
	private int accno;
	private String name;
	private double balance;
	private LocalDate createdon;
	private LocalDate updatedon;
	private acctype type;
	private boolean isactive;
	public bank(int accno, String name, double balance, LocalDate createdon, acctype type) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.createdon = createdon;
		this.updatedon =this.createdon;
		this.type = type;
		this.isactive=true;
	}
	
	
	public bank(int accno) {
		super();
		this.accno = accno;
	}


	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getCreatedon() {
		return createdon;
	}
	public void setCreatedon(LocalDate createdon) {
		this.createdon = createdon;
	}
	public LocalDate getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(LocalDate updatedon) {
		this.updatedon = updatedon;
	}
	public acctype getType() {
		return type;
	}
	public void setType(acctype type) {
		this.type = type;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "bank [accno=" + accno + ", name=" + name + ", balance=" + balance + ", createdon=" + createdon
				+ ", updatedon=" + updatedon + ", type=" + type + "]";
	}
	
	

}
