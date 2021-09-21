package com.amitsisodiya.wagebuilder;

public class WageBuilderUC1 {

	public static void main(String[] args) {
		int empIsPresent = 1;
		int empCheck = (int) Math.floor(Math.random() * 10 % 2);
		if (empCheck == empIsPresent) {
			System.out.println("Employee is present.");
		} else
			System.out.println("Employee is absent.");
	}
}
