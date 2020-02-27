package com.capgemini.pecunia.dao;

import com.capgemini.pecunia.controller.Account;
import com.capgemini.pecunia.controller.Transaction;

@SuppressWarnings("unused")
public interface TransactionDAO {
		//public Account getAccountById(String AccountID);
		
		public double getBalance(Account A);
		public boolean updateBalance(Account A, double amount);
		
		//public int generateChequeId(Cheque C);
		
		//public int generateTransactionId(Transaction T);
		
//		public int creditUsingCheque(String accountNumber, double balance);
//		public int debitUsingSlip(String accountNumber, double balance);
//		public int creditUsingSlip(String accountNumber, double balance);
//		public int debitUsingCheque(String accountNumber, double balance);
		

	}
