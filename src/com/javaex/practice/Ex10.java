package com.javaex.practice;
import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int high = 0;
		int num;
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();
			if(i==0) {
				high = num;
			
			} else if(num > high) {
				high = num;
			}
		}
		
		System.out.println("최개값은 " + high + "입니다.");
		sc.close();
	}
}
