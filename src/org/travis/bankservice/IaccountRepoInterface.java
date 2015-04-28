package org.travis.bankservice;

public interface IAccountRepoInterface {
	
	public double balance(String accountId);
	
	public double credit(String accountId, double amount);
	
	public double debit(String accountId, double amount);
	
	public boolean transfer(String fromAccId, String toAccountId, double amount);

}
