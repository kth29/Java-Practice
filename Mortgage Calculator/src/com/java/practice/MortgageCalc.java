package com.java.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
	
	int principal = 0;
	double interestRate = 0.0;
	int period = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculate Your Mortgage!");
		System.out.println("*******************************************************");
		
		System.out.print("Principal: ");
		int principal = sc.nextInt();
		System.out.print("Annual Interest Rate: ");
		double rate = sc.nextDouble();
		System.out.print("Period (Years): ");
		int period = Math.multiplyExact(sc.nextInt(), 12);
		
		//calculate monthly mortgage = P*(r(1+r)^n)/((1+r)^n-1)
		double intRate = (rate /100)/12;
		double mortPay = principal * ((intRate*(Math.pow((intRate + 1), period)))/((Math.pow((intRate + 1), period)- 1)));
		System.out.println("Monthly Mortgage Payment: " + NumberFormat.getCurrencyInstance().format(mortPay));
		
		sc.close();

	}

}
