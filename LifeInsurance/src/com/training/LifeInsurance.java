package com.training;
public class LifeInsurance {
	private long policyNumber;
	private String policyHolderName;
	private String paymentMode;
	private double policyAmount;
	//Static Block
	static
	{
		System.out.println("Static Block Called");
	}
	//Initialization Block
	{
		System.out.println("Initialization Block Called");
	}
	
	public LifeInsurance()
	{
		super();
		System.out.println("Constructor Block Called");
	}
	
	public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode, double policyAmount)
	{
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.paymentMode = paymentMode;
		this.policyAmount = policyAmount;
	}
		
	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
public double calculate()
{
	return this.policyAmount *.10;
}

/* Improper Overloading:
 * public double calculate(){} - this is duplication, not overloading
 * or
 * public int calculate(){} - changing return type is not overloading
 * or
 * private double calculate(){} - changing modifier is not allowed
 */

//Overloaded Method
public double calculate(double policyAmt)
{
	double amount = policyAmt * .10;
	double discount = amount * .05;
	double netAmount = amount - discount;
	return netAmount;
}

@Override
public String toString()
{
	return this.policyNumber + ": " + this.policyHolderName;
}

@Override
public boolean equals(Object obj) {
	//Checking for Identity
	if(this==obj)
		return true;
	//Cautious
	if(obj==null)
		return false;
	//Checking the type of Object 
	if(this.getClass() != obj.getClass())
		return false;
	//Casting
	LifeInsurance ins = (LifeInsurance)obj;
	return policyNumber == ins.policyNumber && policyHolderName.equals(ins.policyHolderName);
}

@Override
public int hashCode() {
	long code = this.policyNumber + 7*policyNumber;
	return (int)code;
}
}

