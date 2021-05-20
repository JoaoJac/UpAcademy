package io.altar.jseproject.utils;

import java.util.Scanner;

public class ScannerUtils {
	private Scanner sc = new Scanner(System.in);
	
	public int getInt() {
		do {
			if(sc.hasNextInt()) {
				return sc.nextInt();
			} else {
				sc.nextLine();
				System.out.println("Input errado! Por favor inserir um número válido:");
			}
		}while(true);
	}
	
	public double getDouble() {
		do {
			if(sc.hasNextDouble()) {
				return sc.nextDouble();
			} else {
				sc.nextLine();
				System.out.println("Input errado! Por favor inserir um número válido:");
			}
		}while(true);
	}
	
	public long getLong() {
		do {
			if(sc.hasNextLong()) {
				return sc.nextLong();
			} else {
				sc.nextLine();
				System.out.println("Input errado! Por favor inserir um número válido:");
			}
		}while(true);
	}
	
	public String getText() {
		do {
			if(sc.hasNext("[a-zA-Z]+")) {
				return sc.nextLine();
			} else {
				sc.nextLine();
				System.out.println("Wrong input! Please insert a valid text:");
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
				System.out.println("Opção não está entre "+min+" e "+max+", por favor insira uma opção válida:");
			}
		}while(true);	
	}
	
	public int getIva() {
		do {
			int iva = getInt();
			if(iva == 6 || iva == 13 || iva == 23) {
				return iva;
			} else {
				sc.nextLine();
				System.out.println("Input errado! Por favor inserir um IVA válido:");
			}
		}while(true);
	}
	
	public String getAnswer() {
		do {
			if(sc.hasNext()) {
				return sc.next();
			} 
		}while (true);
	}
}

