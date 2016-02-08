package com.training;

import java.util.Scanner;

public class InsuranceApplication {

	public static void main(String[] args) {
		LifeInsurance ins1 = new LifeInsurance();
		
		//Instance Variable has a default value
		System.out.println(ins1.calculate());
		
		//
		LifeInsurance ins2 = new LifeInsurance(984488,"Ramesh","QTR",60000);
		System.out.println(ins2.calculate());
		
		//Wrapper Class
		long policyNumber = Long.parseLong(args[0]);
		double policyAmount = Double.parseDouble(args[3]);
		//Command Line Arguments
		LifeInsurance ins3 = new LifeInsurance(policyNumber, args[1], args[2], policyAmount);
		System.out.println(ins3.calculate());
		
		//Using Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Policy Numer");
		long policyNumber2 = sc.nextLong();
		System.out.println("Enter Policy Holder Name");
		String policyHolderName2 = sc.next();
		System.out.println("Enter PaymentMode");
		String paymentMode2 = sc.next();
		System.out.println("Enter Premium Amount");
		double policyAmount2 = sc.nextDouble();
		LifeInsurance ins4 = new LifeInsurance(policyNumber2, policyHolderName2, paymentMode2, policyAmount2);
		System.out.println(ins4.calculate());
		sc.close();
		
		//
		LifeInsurance ins5 = new LifeInsurance();
		System.out.println(ins5.calculate(100000));
	}
}
