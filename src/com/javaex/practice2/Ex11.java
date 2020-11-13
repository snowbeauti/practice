package com.javaex.practice2;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳: ");
		String alphbet = sc.next();
		
		switch (alphbet) {
		case "a":
		case "o":
		case "u":	
		case "e":
		case "i":	
		System.out.print("모음입니다.");
		break;
		
		case "q":
		case "w":
		case "r":	
		case "t":	
		case "y":	
		case "p":	
		case "s":	
		case "d":	
		case "f":	
		case "g":	
		case "h":	
		case "j":	
		case "k":
		case "l":
		case "z":
		case "x":
		case "c":
		case "v":
		case "b":
		case "n":
		case "m":
		System.out.print("자음입니다.");	
		break;
		default : System.out.print("잘못입력하셨습니다.\n소문자 알파벳을 입력해주세요.");	
		
		}
		
		sc.close();
	}

}
