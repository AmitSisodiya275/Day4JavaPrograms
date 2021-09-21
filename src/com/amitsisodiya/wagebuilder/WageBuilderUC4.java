package com.amitsisodiya.wagebuilder;

public class WageBuilderUC4 {

	public static void main(String[] args) {

		final int empIsFullTime = 1;
		final int empIsPartTime = 2;
		final int empPerHrWage = 20;
		int empHrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10 % 3);

		switch (empCheck) {
		case empIsFullTime:
			empHrs = 8;
			break;
		case empIsPartTime:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}

		int empWage = empHrs * empPerHrWage;
		System.out.println("Wage of the employee is : " + empWage);
	}

}
