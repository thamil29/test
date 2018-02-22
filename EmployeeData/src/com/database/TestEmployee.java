package com.database;

public class TestEmployee {

	public static void main(String[] args) {

		Employee alex = new Employee();
		alex.empId = 1;
		alex.empName = "Thamil";
		alex.empSalary = 10000;
		alex.empBonus = 2000;
		alex.calculatePay();

		System.out.println("Total pay =" + alex.empTotal);

	}

}
