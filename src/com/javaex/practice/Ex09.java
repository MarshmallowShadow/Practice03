package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1; i<=10; i++) {
			for(j=i; j<i+10; j++) {
				System.out.print(j);
				if(j<10) System.out.print(" \t");
				else System.out.print("\t");
			}
			System.out.println("");
		}
	}
}
