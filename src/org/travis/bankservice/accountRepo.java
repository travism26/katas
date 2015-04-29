package org.travis.bankservice;

import java.util.Map;

public class accountRepo implements IAccountRepoInterface {

	Map<String, Double> accounts;

	public accountRepo(Map<String, Double> accounts)
	{
		this.accounts = accounts;
	}

	@Override
	public double balance(String accountId)
	{
		return accounts.get(accountId);
	}

	@Override
	public double credit(String accountId, double amount)
	{
		double balance = accounts.get(accountId);
		balance += amount;
		accounts.put(accountId, balance);
		return balance;
	}

	@Override
	public double debit(String accountId, double amount)
	{
		double balance = accounts.get(accountId);
		balance -= amount;
		accounts.put(accountId, balance);
		return balance;
	}

	@Override
	public boolean transfer(String fromAccountId, String toAccountId, double amount)
	{
		double toAccountBalance = accounts.get(toAccountId);
		double fromAccountBalance = accounts.get(fromAccountId);
		
		if((fromAccountBalance - amount) < 0){
			//roll back transaction
			return false;
		} else{
			//proceed with transaction.
			fromAccountBalance -= amount;
			toAccountBalance += amount;
			
			//commit new info to DB
			accounts.put(toAccountId, toAccountBalance);
			accounts.put(fromAccountId, fromAccountBalance);
			return true;
		}
	}

}
