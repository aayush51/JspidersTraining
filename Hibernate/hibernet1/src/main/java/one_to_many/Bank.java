package one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Bank {
	@Id
	private int id;
	private String name;
	private String branch;
	
	@OneToMany
	List<Account> accounts;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public Bank() {
		super();
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branch=" + branch + ", accounts=" + accounts + "]";
	}
	

}
