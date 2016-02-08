package com.training;

public class OverRiding_Application {

	public static void main(String[] args) {
		
		LifeInsurance ins1 = new LifeInsurance(101, "Ramesh", "QTR", 10000);
		LifeInsurance ins2 = new LifeInsurance(101, "Ramesh", "QTR", 10000);
		LifeInsurance ins3=ins1;
		System.out.println("Extact value " + ins1.equals(ins2));
		System.out.println("Identity " + ins1.equals(ins3));
		String s = new String("Hello");
		System.out.println("Different Type " + ins1.equals(s));
		LifeInsurance ins4 = null;
		System.out.println("Cautious " + ins1.equals(ins4));
		//System.out.println(ins1==ins2);
	}
}
