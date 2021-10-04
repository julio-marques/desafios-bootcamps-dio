package com.dio;

/*
 * Divisores I
 * 
 * Ler um n�mero inteiro N e calcular todos os seus divisores.
 *
 * Entrada
 * O arquivo de entrada cont�m um valor inteiro.
 * 
 * Sa�da
 * 
 * Escreva todos os divisores positivos de N, um valor por linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class Divisores1 {
	
	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int N = leitor.nextInt();
        
        for (int i = 1; i <= N; i++) {
        	
        	if (N % i == 0) 
        		
        		System.out.println(i);
        }
        
    }

}