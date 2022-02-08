package org.howard.edu.lsp.assignment2;

import java.util.Scanner;

public class ScannerStdin{
	public static int sum = 0, product = 1;
	public static void processInput() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("String?");
			String input = scanner.nextLine();
			if(input.charAt(0) == 'G')
				break;
			else
				scanString(input);
			System.out.println(sum + "\n");
			System.out.println(product + "\n");
			sum = 0;
			product = 1;
				}
	}
	public static void scanString(String input) {
	int number, index, beginIndex = 0;
	String stringNo;
	while(true) {
		index = input.indexOf(' ');
		if(index == -1)
			break;
		else {
			number = Integer.parseInt(input.substring(beginIndex, index));
		sum += number;
		product *= number;
		input = input.substring(index + 1, input.length());
		System.out.println(number + "\n");
		}
}
	number = Integer.parseInt(input);
	sum += number;
	product *= number;
	System.out.println(number + "\n");
}
	
	
public static void main(String args[]) {
	processInput();
}
}
