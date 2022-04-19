package com.javaex.practice;
import java.util.*;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int guess;
		int randNum;
		int count;
		String option;
		
		while(true) {
			System.out.println("=======================");
			System.out.println("  [숫자맞추기 게임 시작]   ");
			System.out.println("=======================");
			randNum = (int)(Math.random()*100 + 1);
			count = 0;
			while(true) {
				count ++;
				System.out.print(">>");
				guess = sc.nextInt();
				if(guess > randNum) {
					System.out.println("너 낮게");
					continue;
				}
				else if(guess < randNum) {
					System.out.println("더 높게");
					continue;
				}
				else {
					System.out.println("정답입니다.");
					break;
				}
			}
			
			System.out.println("입력 횟수: " + count);
			System.out.print("게임을 종료하시겠습니까? y/n >>");
			option = sc.next();
			if(isExit(option)) break;
			else continue;
		}
		
		System.out.println("=======================");
		System.out.println("  [숫자맞추기 게임 종료]   ");
		System.out.println("=======================");
		
		sc.close();
	}
	
	
	public static boolean isExit(String s) {
		if(s.equals("y") || s.equals("yes") || 
				s.equals("yep") || s.equals("yeah") ||
				s.equals("yea") || s.equals("네") ||
				s.equals("예") || s.equals("넵") ||
				s.equals("넹") || s.equals("ㅇㅇ")) {
			return true;
		}
		else if(s.equals("n") || s.equals("no") ||
				s.equals("nope") || s.equals("nu") ||
				s.equals("fuck you") || s.equals("아니요") ||
				s.equals("아니용") || s.equals("싫어요") ||
				s.equals("싫어용") || s.equals("싫어") ||
				s.equals("싫엉") || s.equals("꺼져") || 
				s.equals("ㄴㄴ") || s.equals("ㅇ")) {
			return false;
		} else {
			System.out.println("잘못입력하셨습니다");
			return true;
		}
	}
}
