package com.javaex.practice2;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수입을 입력해 주세요.");
		System.out.print("금액: ");
		
		double salary;
		salary = sc.nextInt();
		
		
		double tax_level_1, tax_level_2, tax_level_3, tax_level_4;
		tax_level_1 = salary * 0.09;
		tax_level_2 = (salary-10000000) * 0.18;
		tax_level_3 = (salary-40000000) * 0.27;
		tax_level_4 = (salary-80000000) * 0.36;
		
		double tax;
		
		if(0 <= salary) { 			
		if(0 <= salary && salary<=10000000) {
			tax = tax_level_1;
		} else if (10000000 < salary && salary<=40000000) {
			tax = tax_level_1 + tax_level_2;
		} else if (40000000 < salary && salary<=80000000) {
			tax = tax_level_1 + tax_level_2 + tax_level_3;
		} else if (80000000 < salary) {
			tax = tax_level_1 + tax_level_2 + tax_level_3 + tax_level_4;
		} System.out.print("소득세는 " + tax + "입니다.");
		} else { System.out.print("잘못 입력했습니다.");}
		
		
		sc.close();
	}

}
