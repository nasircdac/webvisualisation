package exam.hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	int accno;
	int pin;
	int balance; 
	int deptid;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", pin=" + pin + ", balance=" + balance + ", deptid=" + deptid + "]";
	}
	public Account(int accno, int pin, int balance, int deptid) {
	
		this.accno = accno;
		this.pin = pin;
		this.balance = balance;
		this.deptid = deptid;
	}
	
	
	public Account() {
		
	}
	
	
	
	

}
