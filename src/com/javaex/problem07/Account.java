package com.javaex.problem07;

public class Account {

	private String accountNo;
	private int balance;

	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public int deposit(int money) {

		balance = balance + money;
		return balance;
	}

	public int withdraw(int money) {

		balance = balance - money;
		return balance;
	}

	public void showBalance() {
		System.out.println(balance);
	}
}

// 사용할 메소드가 이미 정의되어 있기 때문에
// 거기에 맞춰서 코드를 작성하면 된다.
// return값으로 각 상황에 맞게 보내주면 된다.
// void면 리턴값이 없고 void 위치에 다른 모양이 들어가면
// 그 모양에 맞게 리턴하면 된다.(ex int 형이면 리턴값으로 int값)