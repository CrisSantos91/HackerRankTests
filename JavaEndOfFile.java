package br.com.testes;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean n = scan.hasNextLine();
		
		String str = "";
		int i = 1;
		while(n){
            
			str= scan.nextLine();
            System.out.print(i+" " +str);
            System.out.println();
            i++;
		}
	}

}
