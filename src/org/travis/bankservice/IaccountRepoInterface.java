package org.travis.bankservice;

public interface IaccountRepoInterface {
	
	public double balance(String accountId);
	
	public double credit(String accountId, double amount);
	
	public double debit(String accountId, double amount);
	
	public double transfer(String fromAccId, String toAccountId, double amount);

}
