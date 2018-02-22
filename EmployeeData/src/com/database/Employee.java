package com.database;

public class Employee {

	int empId;
	String empName;
	double empSalary;
	double empBonus;
	double empTotal;

	void calculatePay() {
		empTotal = empSalary + empBonus;
	}
}
