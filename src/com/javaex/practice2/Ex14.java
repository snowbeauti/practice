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
		
		long ran1, ran2, ran3;
		ran1 = 1000;
		ran2 = 4000;
		ran3 = 8000;
		
		double tax;
		
		if(0 <= salary) { 			
		if(0 <= salary && salary<=ran1) {
			tax = salary * lev1;
		} else if (ran1 < salary && salary<=ran2) {
			tax = ran1 * lev1 + (salary-ran1) * lev2;
		} else if (ran2 < salary && salary<=ran3) {
			tax = ran1 * lev1 + (ran2 - ran1) * lev2 + (salary - ran2) * lev3;
		} else  {tax = ran1 * lev1 + (ran2 - ran1) * lev2 + (ran3 - ran2) * lev3 + (salary - ran3) * lev4;
		} System.out.print("소득세는 " + tax + "입니다.");
		} else { System.out.print("잘못 입력했습니다.");}
		
		
		sc.close();
	}

}
