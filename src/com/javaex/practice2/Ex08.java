package com.javaex.practice2;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("숫자 3개를 입력해주세요.");
		
		int x, y, z;
		System.out.print("숫자1: ");
		x = sc.nextInt();
		System.out.print("숫자2: ");
		y = sc.nextInt();
		System.out.print("숫자3: ");
		z = sc.nextInt();
		
		int less;//가장작은 수 
		
		if(x==y && x==z) {
			System.out.println("모두 같은 수 입니다.");
			less = x;
		} else if(x<=y && x<=z) {
			less = x; 
		} else if (y<=x && y<=z) {
			less = y;
		} else if (z<=x && z<=y) {
			less = z;
		}
		
		System.out.print("가장 작은수는 " + less + " 입니다.");
		
		sc.close();
	}
}
