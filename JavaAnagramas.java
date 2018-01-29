package br.com.testes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. 
For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
Portanto, as palavras devem ter o mesmo tamanho, mas não necessariamente a mesma ordem!*/
public class JavaAnagramas {
    static boolean isAnagram(String a, String b) {
        
        if ((a == null || b == null) || (a.length() != b.length())) {
           return false;
       }
        final char[] ARRAY_A = a.toUpperCase().toCharArray();
       final Map<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < ARRAY_A.length; i ++) {
           if (map.containsKey(ARRAY_A[i])) {
               map.put(ARRAY_A[i], (map.get(ARRAY_A[i]) + 1));
           } else {
               map.put(ARRAY_A[i], 1);
           }
       }
       final char[] ARRAY_B = b.toUpperCase().toCharArray();
       for (int i = 0; i < ARRAY_A.length; i ++) {
           if (map.containsKey(ARRAY_B[i])) {
               Integer count = map.get(ARRAY_B[i]);
               if (count == 0) {
                   return false;
               } else {
                   count --;
                   map.put(ARRAY_B[i], count);
               }
           } else {
               return false;
           }
       }
       return true;
   }
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("A: ");
		String a = scan.next();
		System.out.println("B: ");
		String b = scan.next();
		scan.close();
		
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "No");//Operador ternario
	}
}
