package desafio_Java;

/*
* Teste de Sele��o 1
*
* Leia 4 valores inteiros A, B, C e D. 
* Com base nisso, se o valor de B for maior do que de C e se D for maior do que A, 
* e a soma de C com D for maior que a soma de A e B e se tanto C quanto D forem 
* positivos e, ainda, se a vari�vel A for par, escreva a mensagem "Valores aceitos", 
* sen�o escrever "Valores nao aceitos".
*
* Entrada
*
* Quatro n�meros inteiros A, B, C e D.
*
* Sa�da
*
* Imprima a mensagem corretamente esperada pela valida��o dos valores.
*/

import java.util.Scanner;

//Classe renomeada
public class TesteDeSelecao1 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}
