package br.com.testes;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class JavaLoopsII {
	public static void main(String []args){
		System.out.println("teste ");
		
	
        Scanner in = new Scanner(System.in);
        
            int t=2;
            
            for(int i=0;i<t;i++){
                int a = 0;
                int b = 2;
                int n = 10;
                int d = 2;
                int query =  (int) (a + Math.pow( d, 0) * b);
                System.out.print(query+" ");
                
                if(n>0){
                	int result=query ;
                	for(int j = 1; j<n; j++){
                	result = result + (int) ( Math.pow( 2,j ) * b);
                	System.out.print(result + " ");
                	}System.out.println("");
                	}
            }
            in.close();
        }
    }
