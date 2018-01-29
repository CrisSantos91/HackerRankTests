package br.com.testes;

import java.util.Scanner;
/*
Um palíndromo é uma palavra, frase ou qualquer outra sequência de unidades 
que tenha a propriedade de poder ser lida tanto da direita para a 
esquerda como da esquerda para a direita*/

public class StringPalindromo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String A = sc.next();

		int i = 0;
		int j = A.length() - 1;
		String respota = "";

		while (i < A.length() && j >= 0) {

			if (A.charAt(j) == A.charAt(i)) {
				respota = "Yes";
			} else {
				respota = "No";
			}
			i++;
			j--;
		}
		System.out.println(respota);

	}
}
