package desafio_Java;

/*
* Valida��o de Nota
*
* Para ajudar a calcular as notas referentes �s duas avalia��es dos alunos, 
* uma professora pediu para que voc� desenvolva um programa que calcule e 
* imprima a m�dia semestral. Fa�a com que o algoritmo s� aceite notas v�lidas 
* (uma nota v�lida deve pertencer ao intervalo [0,10]). 
* Cada nota deve ser validada separadamente.
*
* Entrada
*
* A entrada cont�m v�rios valores reais, positivos ou negativos. 
* O programa deve ser encerrado quando forem lidas duas notas v�lidas.
*
* Sa�da
*
* Se uma nota inv�lida  for lida, deve ser impressa a mensagem "nota invalida".
* Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem 
* "media = " seguido do valor do c�lculo. O valor deve ser apresentado 
* com duas casas ap�s o ponto decimal.
*/

import java.util.Scanner;

//Classe renomeada
public class ValidacaoDeNota {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		double total = 0;

		while (count != 2) {
			double x = sc.nextDouble();
			if (x >= 0 && x <= 10) {
				total += x;
				count++;

			} else {
				System.out.println("nota invalida");
			}
		}
		System.out.printf("media = %.2f\n", (total / count));

	}
}
