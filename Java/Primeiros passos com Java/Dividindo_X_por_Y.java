package desafio_Java;

/*
 * Dividindo X por Y
 * 
 * Voc� ter� o desafio de escrever um algoritmo que leia 2 n�meros e 
 * imprima o resultado da divis�o do primeiro pelo segundo. Caso n�o 
 * for poss�vel, mostre a mensagem �divisao impossivel� para os valores 
 * em quest�o.
 *
 * Entrada
 *
 * A entrada cont�m um n�mero inteiro N. Este N ser� a quantidade de 
 * pares de valores inteiros (X e Y) que ser�o lidos em seguida.
 *
 * Sa�da
 *
 * Para cada caso mostre o resultado da divis�o com um d�gito ap�s o 
 * ponto decimal, ou �divisao impossivel� caso n�o seja poss�vel 
 * efetuar o c�lculo.
*/

import java.io.IOException;
import java.util.Scanner;

//Classe renomeada
public class Dividindo_X_por_Y {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();
		int X, Y;
		float divisao;

		for (int i = 0; i < N; i++) {
			X = leitor.nextInt();
			Y = leitor.nextInt();

			if (Y == 0) {
				System.out.println("divisao impossivel");

			} else {
				divisao = (float) X / Y;
				System.out.printf("%.1f\n", divisao);

			}

		}
	}

}
