package org.travis.bankservice;

public class bankService implements IBankService {

	IAccountRepoInterface repo;
	public bankService(IAccountRepoInterface repo){
		this.repo = repo;
	}
	
	@Override
	public double getAccountBalance(String accountId)
	{
		return this.repo.balance(accountId);
	}

}
