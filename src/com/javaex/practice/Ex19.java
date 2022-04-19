package com.javaex.practice;
import java.util.*;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int amt = 0;
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("예금엑>");
				num = sc.nextInt();
				amt += num;
			} else if(num == 2) {
				System.out.print("출금엑>");
				num = sc.nextInt();
				if(amt > num) amt += num;
				else System.out.println("잔엑부족: 다시 시도하세요");
			} else if(num == 3) {
				System.out.println("잔고엑>" + amt);
			} else if(num == 4) {
				break;
			}
			else {
				System.out.println("다시입력해주세요");
			}
		}
		
		System.out.println("프로그램 종료...");
		sc.close();
	}
}
