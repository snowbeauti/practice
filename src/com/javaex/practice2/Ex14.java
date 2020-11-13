package com.javaex.practice2;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수입을 입력해 주세요.");
		System.out.print("금액: ");
		
		double salary;
		salary = sc.nextInt();
		
		
		double lev1, lev2, lev3, lev4;
		lev1 = 0.09;
		lev2 = 0.18;
		lev3 = 0.27;
		lev4 = 0.36;
		
		double tax;
		
		if(0 <= salary) { 			
		if(0 <= salary && salary<=1000) {
			tax = salary * lev1;
		} else if (1000 < salary && salary<=4000) {
			tax = 1000 * lev1 + (salary-1000) * lev2;
		} else if (4000 < salary && salary<=8000) {
			tax = 1000 * lev1 + 3000 * lev2 + (salary-4000) * lev3;
		} else  {
			tax = 1000 * lev1 + 3000 * lev2 + 4000 * lev3 + (salary-8000) * lev4;
		} System.out.print("소득세는 " + tax + "입니다.");
		} else { System.out.print("잘못 입력했습니다.");}
		
		
		sc.close();
	}

}
