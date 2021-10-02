package desafio_Java;

/*
 * Soma Simples
 * 
 * Leia dois valores inteiros identificados como vari�veis A e B. 
 * Calcule a soma entre elas e chame essa vari�vel de SOMA.
 * A seguir escreva o valor desta vari�vel.

 * Entrada
 * 
 * O arquivo de entrada cont�m 2 valores inteiros.

 * Sa�da
 * 
 * Imprima a vari�vel SOMA com todas as letras mai�sculas, inserindo 
 * um espa�o em branco antes e depois do s�mbolo de igualdade, 
 * seguido pelo valor correspondente � soma de A e B.*/

import java.util.Scanner;

//Classe renomeada
public class SomaSimples {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner (System.in);
 
		int A, B, soma;
 
 		A = sc.nextInt();
		B = sc.nextInt();
 
 		soma = A + B; 
 
 		System.out.println("SOMA = " + soma);
 
 		sc.close();

	}

}
