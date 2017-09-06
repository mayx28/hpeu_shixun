package com.qingshixun.atm.service;

import com.qingshixun.atm.model.Account;

/**
 * 账户抽象类
 */

public abstract class AbstactAccount implements AccountService {
	// 银行账户数组
	protected static Account[] accounts = new Account[2];
	/**
	 * 初始化账户信息
	 */
	public void initAccounts() {
		//第一个账户
		Account account1=new Account();
		account1.setName("may");
        account1.setPassword("123");
        account1.setBalance(800);
        accounts[0] = account1;
        //第二个账户
        Account account2 = new Account();
        account2.setName("sunny");
        account2.setPassword("456");
        account2.setBalance(600);
        accounts[1] = account2;
	}
}
