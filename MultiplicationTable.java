package com.codegnan.controlstatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int number=scanner.nextInt();
		
		for(int i=1;i<=20;i++) {
			System.out.println(number+" * "+i+" = "+(number*i));
		}

	}

}
