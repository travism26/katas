package org.travis.bankservice;

import java.util.*;

public class bankTester {
	public static void main(String[] args)
	{
		HashMap<String, Double> accounts = new HashMap();
		
		accounts.put("travisMartin", 500.00);
		accounts.put("jesseMartin", 300.00);
		IAccountRepoInterface repo = new accountRepo(accounts);
		IBankService service = new bankService(repo);
		
		repo.credit("jesseMartin", 700);
		
		System.out.println("jesse: "+service.getAccountBalance("jesseMartin"));
		System.out.println("travis: "+service.getAccountBalance("travisMartin"));
		
		repo.transfer("jesseMartin", "travisMartin", 250);
		
		System.out.println("jesse after xfer: "+service.getAccountBalance("jesseMartin"));
		System.out.println("travis after xfer: "+service.getAccountBalance("travisMartin"));
		
		System.out.println("Travis owes 50$ and pays");
		repo.debit("travisMartin", 50);
		System.out.println("Travis' Account Balance: "+service.getAccountBalance("travisMartin"));
		
		
	}
}
