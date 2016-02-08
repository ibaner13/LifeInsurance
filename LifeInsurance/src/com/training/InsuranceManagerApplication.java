package com.training;

public class InsuranceManagerApplication {

	public static void main(String[] args) {
		LifeInsurance ins1 = new LifeInsurance(101, "Ramesh", "QTR", 450000);
		LifeInsurance ins2 = new LifeInsurance(102, "Rajesh", "HLF", 550000);
		LifeInsurance ins3 = new LifeInsurance(103, "Rakesh", "ANN", 650000);
		LifeInsurance ins4 = new LifeInsurance(104, "Rangesh", "QTR", 700000);
		
		LifeInsurance[] policies = new LifeInsurance[4];
		policies[0] = ins1;
		policies[1] = ins2;
		policies[2] = ins3;
		policies[3] = ins4;
		
		InsuranceManager imObj = new InsuranceManager();
		imObj.printPremiums(policies);
	}
}
