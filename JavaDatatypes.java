package br.com.testes;

import java.util.Scanner;

public class JavaDatatypes {
	// byte -128 =< x <=127
	// short -32768 =< x <=32767
	// int -2^31 =< x <= 2^31 -1
	// long -2^63 =< x <= 2^63 -1
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int posi = (int)(Math.pow(2,31) -1);
		int negat = (int)(Math.pow(-2,31));
		
		long p = (int)(Math.pow(2,31) -1);
		long neg = (int)(Math.pow(-2,31));
		
		for (int i = 0; i < t; i++) {

			try {
				long x = (long) (- 10 * Math.pow(10, 13));
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127){
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
					
				}else if (x>= -32768 && x <= 32767){
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}else if(x>= negat && x <= posi){
					System.out.println("* int");
					System.out.println("* long");
				}else if(x>= neg || x <= p){
					System.out.println("* long");
				}
				
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}

}
