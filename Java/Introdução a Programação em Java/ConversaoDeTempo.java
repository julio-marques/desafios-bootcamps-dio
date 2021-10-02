package desafio_Java;

/*
* Convers�o de Tempo
*
* Voc� ter� o desafio de ler um valor inteiro, que � o tempo de dura��o 
* em segundos de um determinado evento em uma loja, e informe-o expresso 
* no formato horas:minutos:segundos.
*
* Entrada
*
* O arquivo de entrada cont�m um valor inteiro N.
*
* Sa�da
*
* Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:
* minutos:segundos, conforme exemplo fornecido.
*/

import java.util.Scanner;

//Classe renomeada
public class ConversaoDeTempo {
  
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec;
        sec = input.nextInt();
        int hour = sec / 3600;
        sec = sec - (hour * 3600);

        int min =  sec / 60;
        sec = sec - (min * 60);

        System.out.println(hour+":"+min+ ":"+sec);
    }
}
