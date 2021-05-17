package io.altar.jseproject.utils;

import java.util.Scanner;

public class ScannerUtils {
	private Scanner sc = new Scanner(System.in);
	
	public int getInt() {
		do {
			if(sc.hasNextInt()) {
				int result = sc.nextInt();
				sc.nextLine();
				return result;
			} else {
				sc.nextLine();
				System.out.println("Wrong input! Please insert a valid number:");
			}
		}while(true);
	}
	
	public double getDouble() {
		do {
			if(sc.hasNextDouble()) {
				double result = sc.nextDouble();
				sc.nextLine();
				return result;
			} else {
				sc.nextLine();
				System.out.println("Wrong input! Please insert a valid number:");
			}
		}while(true);
	}
	
	public long getLong() {
		do {
			if(sc.hasNextLong()) {
				long result = sc.nextLong();
				sc.nextLine();
				return result;
			} else {
				sc.nextLine();
				System.out.println("Wrong input! Please insert a valid number:");
			}
		}while(true);
	}
	
	public String getText() {
		do {
			if(sc.hasNext("[a-zA-Z]+")) {
				return sc.nextLine();
			} else {
				sc.nextLine();
				System.out.println("Wrong name! Please insert a valid Name:");
			}
		}while (true);
	}
	
	public int getIntInRange(int min, int max) {
		do {
			int val = getInt();
			if(min <= val && val <= max) {
				return val;
			}
			else {
				sc.nextLine();
				System.out.println("Option is not between "+min+" and "+max+", please insert a valid option:");
			}
		}while(true);	
	}
}

