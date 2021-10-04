package desafio_Java;

/* 
 * Tuitando
 *
 * O microblog Twitter � conhecido por limitar as postagens em 140 caracteres. 
 * Conferir se um texto vai caber em um tu�te � sua tarefa.
 * 
 * Entrada
 *
 * A entrada � uma linha de texto T (1 <= |T| <= 500).
 *
 * Sa�da
 *
 * A sa�da � dada em uma �nica linha. Ela deve ser "TWEET" (sem as aspas)
 * se a linha de texto T tem at� 140 caracteres. 
 * Se T tem mais de 140 caracteres, a sa�da deve ser "MUTE".
*/

import java.io.IOException;
import java.util.Scanner;

//Classe renomeada
public class Tuitando {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	String T = leitor.nextLine();
    	System.out.println(T.length() > 140 ? "MUTE" : "TWEET"); 
    }
	
}