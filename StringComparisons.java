package br.com.testes;

import java.util.Scanner;

// exercicio https://www.hackerrank.com/challenges/java-string-compare/problem
public class StringComparisons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String s = scan.next();
		System.out.println("Digite um numero: ");
		int k = scan.nextInt();
		scan.close();

		String min = s.substring(0, k);
		String max = min;
		int lastSubStr = s.length() - k + 1;

		for (int i = 0; i < lastSubStr; ++i) {
			String sub = s.substring(i, i + k);
			min = (min.compareTo(sub) < 0) ? min : sub;
			max = (max.compareTo(sub) < 0) ? sub : max;
		}

		System.out.println(min + System.getProperty("line.separator") + max);
	}
}
