package com.amitsisodiya.wagebuilder;

public class WageBuilderUC5 {

	public static void main(String[] args) {
		// Constants
		final int empIsFullTime = 1;
		final int empIsPartTime = 2;
		final int empPerHrWage = 20;
		final int MAX_WORKING_DAYS = 20;
		// Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		for (int day = 1; day <= MAX_WORKING_DAYS; day++) {
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

			empWage = empHrs * empPerHrWage;
			System.out.println("Wage of the employee is : " + empWage);
			totalEmpWage += empWage;
		}
		System.out.println("Total Employee wage is : " + totalEmpWage);
	}

}
