package com.javaex.practice2;

import java.util.Scanner;

public class Ex01 {

public static void main(String[] args){
	
	
	Scanner sc = new Scanner(System.in);
	
	
	int age = 15;
	 
	
	//age가 0살 초과이고 8살 미만이면
	if(0<age && age<18) {
		System.out.print("청소년 입니다.");
	}
	
	sc.close();
	
}
	
}

