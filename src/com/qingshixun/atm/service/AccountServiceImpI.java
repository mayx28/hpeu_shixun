package com.qingshixun.atm.service;

import com.qingshixun.atm.model.Account;

public class AccountServiceImpI extends AbstactAccount {
	/**
	 * 登陆判断,并返回索引
	 */
	public int login(String inputName, String inputPassword) {
		for (int i = 0; i < accounts.length; i++) {
			if (inputName.equals(accounts[i].getName()) && inputPassword.equals(accounts[i].getPassword())) {
				return i;
			}
		}
		return -1;// 登陆失败
	}

	/**
	 * 余额查询
	 */
	public double queryBlance(int accountIndex) {
		return accounts[accountIndex].getBalance();
	}

	/**
	 * 存款
	 */
	public double deposit(int accountIndex, double depositAmount) {
		// 获取用户当前余额
		double nowBalance = accounts[accountIndex].getBalance();
		// 重置用户余额
		double balance = nowBalance + depositAmount;
		accounts[accountIndex].setBalance(balance);
		// 返回用户余额
		return balance;
	}

	/**
	 * 取款
	 */
	public double withdraw(int accountIndex, double withdrawAmount) {
		// 获取用户当前余额
		double nowBalance = accounts[accountIndex].getBalance();
		// 重置用户余额
		double balance = nowBalance - withdrawAmount;
		accounts[accountIndex].setBalance(balance);
		// 返回用户余额
		return balance;
	}

	/**
	 * 修改密码,-1：输入的原密码不正确 1：修改密码成功
	 */
	public int changePassword(int accountIndex, String newPasswordAgain, String originalPassword) {
		// 获得原密码
		String password = accounts[accountIndex].getPassword();
		if (password.equals(originalPassword)) {// 判断输入的原密码是否正确
			// 设置新密码
			accounts[accountIndex].setPassword(newPasswordAgain);
			return 1;
		} else {
			return -1;
		}

	}

	/**
	 * 转账 返回值：-1:表示不能给自己转账; -2：表示余额不足 ;-3：不存在对方账户 1:转账成功
	 */
	public double transfer(int accountIndex, String targetAccountName, double transferAmount) {
		// 获取当前用户信息
		Account account = accounts[accountIndex];
		// 遍历用户数组，获取有关对方账户的信息
		for (int i = 0; i < accounts.length; i++) {
			if (targetAccountName.equals(accounts[i].getName())) { // 对方账户存在
				if (accountIndex == i) {
					// 不能给自己转账
					return -1;

				} else {
					if (account.getBalance() > transferAmount) {
						// 转账成功,并返回用户余额
						return withdraw(accountIndex, transferAmount);

					} else {
						// 余额不足
						return -2;
					}

				}
			}
		}
		return -3;// 对方账户不存在
	}
}
