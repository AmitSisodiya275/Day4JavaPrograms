package com.amitsisodiya.wagebuilder;

public class WageBuilderUC2 {

	public static void main(String[] args) {
		int empIsPresent = 1;
		int empPerHrWage = 20;
		int empHrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10 % 2);
		if (empCheck == empIsPresent)
			empHrs = 8;
		int empWage = empHrs * empPerHrWage;
		System.out.println("Wage of the employee is : " + empWage);
	}

}
