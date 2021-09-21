package com.amitsisodiya.wagebuilder;

public class WageBuilderUC6 {

	public static void main(String[] args) {

		// Constants
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int PER_HR_WAGE = 20;
		final int MAX_WORKING_DAYS = 20;
		final int MAX_WORKING_HRS = 100;
		// Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHr = 0;
		int totalEmpWorkingDays = 0;

		while (totalEmpWorkingDays <= MAX_WORKING_DAYS && totalEmpHr <= MAX_WORKING_HRS) {

			int empCheck = (int) Math.floor(Math.random() * 10 % 3);

			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				totalEmpWorkingDays++;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				totalEmpWorkingDays++;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHr += empHrs;
			empWage = empHrs * PER_HR_WAGE;

			System.out.println(
					"Day " + totalEmpWorkingDays + " Working Hours " + empHrs + " , & Todays wage is " + empWage);
		}
		totalEmpWage = totalEmpHr * PER_HR_WAGE;
		System.out.println("Total wage = " + totalEmpWage);
	}

}
