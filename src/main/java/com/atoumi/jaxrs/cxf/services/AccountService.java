package com.atoumi.jaxrs.cxf.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.atoumi.jaxrs.cxf.vo.Account;

/**
 * ahmed.ettoumi@gmail.com <br />
 * 26 mars 2016
 *
 */
public class AccountService implements AccountServiceInterface {
	Map<String, Account> accounts = new HashMap<String, Account>();

	public void init() {

		Account newAccount1 = new Account();
		newAccount1.setId(1);
		newAccount1.setName("Ahmed Toumi");

		Account newAccount2 = new Account();
		newAccount2.setId(2);
		newAccount2.setName("Yakin Toumi");

		accounts.put("1", newAccount1);
		accounts.put("2", newAccount2);

	}

	public AccountService() {
		init();
	}

	public Account getAccount(final String id) {
		Account c = accounts.get(id);
		return c;
	}

	public Collection<Account> getAllAccounts() {
		return accounts.values();
	}
}
