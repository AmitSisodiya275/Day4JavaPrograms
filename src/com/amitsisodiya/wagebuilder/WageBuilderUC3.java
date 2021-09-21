package com.amitsisodiya.wagebuilder;

public class WageBuilderUC3 {

	public static void main(String[] args) {

		int empIsFullTime = 1;
		int empIsPartTime = 2;
		int empPerHrWage = 20;
		int empHrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10 % 3);
		if (empCheck == empIsFullTime) {
			empHrs = 8;
		} else if (empCheck == empIsPartTime) {
			empHrs = 4;
		}
		int empWage = empHrs * empPerHrWage;
		System.out.println("Wage of the employee is : " + empWage);
	}

}
