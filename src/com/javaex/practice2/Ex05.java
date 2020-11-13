package com.javaex.practice2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		long height, weight;
		System.out.print("키: ");
		height = sc.nextLong();
		System.out.print("몸무게: ");
		weight = sc.nextLong();
		
		double normalweight;
		normalweight = (double) ((height-100)*0.9);
		
		if (weight > normalweight) {
			System.out.println("과체중 입니다.");
		}  else if (weight < normalweight) {
			System.out.println("저체중 입니다.");
		} else {
			System.out.println("표준체중 입니다.");
		}
		
		System.out.print("표준체중: " + normalweight);
				
		sc.close();
	}
}
