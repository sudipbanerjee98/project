package Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Bank_account {
	
	@Id
	@SequenceGenerator(initialValue = 445556651, allocationSize = 1, sequenceName = "acc_no", name = "acc_no" )
	@GeneratedValue(generator = "acc_no")
	
	long ac_no;
	@Column
	String account_type;
	@Column
	double acc_limit;
	@Column
	boolean status;
	@Column
	double amount;
	
	@ManyToOne
	Customer customer;
	
	@OneToMany(cascade = CascadeType.ALL)// used to save the data inside the database without using being, persist, commit
	List<BankTransaction> list;

	public long getAc_no() {
		return ac_no;
	}

	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public double getAcc_limit() {
		return acc_limit;
	}

	public void setAcc_limit(double acc_limit) {
		this.acc_limit = acc_limit;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<BankTransaction> getList() {
		return list;
	}

	public void setList(List<BankTransaction> list) {
		this.list = list;
	} 
	
	
	
	
	
	

}
