package com.javaex.problem04;

public class CConverterApp {

	public static void main(String[] args) {

		double dollar;
		double won;

		CConverter.setRate(1118.70);

		won = CConverter.toDoller(1000000);
		System.out.println(won);
		// 1. System.out.println(CConverter.toDoller(1000000));
		// 백만원을 달러로 출력

		dollar = CConverter.toKWR(100);
		System.out.println(dollar);
		// 100달려를 원으로 출력

	}

}
