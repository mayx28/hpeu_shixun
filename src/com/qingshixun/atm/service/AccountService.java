package com.qingshixun.atm.service;
/**
 * 账户接口
 * @author May_X
 *
 */
public interface AccountService {
	void initAccounts();

	int login(String inputName, String inputPassword);

	double queryBlance(int accountIndex);

	double deposit(int accountIndex, double depositAmount);
}
