package org.travis.bankservice;

public class bankService implements IBankService {

	IaccountRepoInterface repo;
	public bankService(IaccountRepoInterface repo){
		this.repo = repo;
	}
	
	@Override
	public double getAccountBalance(String accountId)
	{
		return this.repo.balance(accountId);
	}

}
