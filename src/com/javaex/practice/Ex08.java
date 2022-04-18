package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=2; i<=9; i++) {
			for(j=2; j<=9; j++) {
				System.out.print(j + " * " + i + " = " + (i*j));
				if(i*j < 10) System.out.print(" \t");
				else System.out.print("\t");
			}
			System.out.println("");
		}
	}
}
