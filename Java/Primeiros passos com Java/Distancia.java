package desafio_Java;

/*
 *  Dist�ncia
 *  
 * Duas motos (X e Y) partem em uma mesma dire��o. 
 * A moto X sai com velocidade constante de 60 Km/h e a moto Y sai 
 * com velocidade constante de 90 Km/h.
 *
 * Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quil�metros 
 * da moto X, ou seja, consegue se afastar um quil�metro a cada 2 minutos.
 *
 * O seu desafio � ler a dist�ncia (em Km) e calcular quanto tempo 
 * leva (em minutos) para a moto Y tomar essa dist�ncia da outra moto.
 *
 * Entrada
 * 
 * O arquivo de entrada cont�m um n�mero inteiro K que representa a 
 * quantidade de quil�metro que que a moto Y deve estar da moto X.
 *
 * Sa�da
 * 
 * Imprima o tempo necess�rio para a moto Y ficar com a quantidade K 
 * de quil�metro da moto X, seguido da mensagem " minutos".
*/

import java.util.Scanner;

//Classe renomeada
public class Distancia {

	public static void main(String[] args) {
    	int minutos;
    	Scanner input = new Scanner(System.in);
    	minutos = input.nextInt();

    	System.out.printf("%d minutos\n", 2 * minutos);

	}

}
