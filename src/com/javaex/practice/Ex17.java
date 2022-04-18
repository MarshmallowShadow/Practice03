package com.javaex.practice;
import java.util.*;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int i;
		int j;
		
		for(i=num; i>=0; i--) {
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
