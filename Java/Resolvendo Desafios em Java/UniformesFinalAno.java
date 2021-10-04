package com.dio;

/* 
 *  Uniformes de final de ano
 *  
 * O professor Girafales organizou a confec��o de um uniforme para 
 * as turmas da escola para comemorar o final do ano. Ap�s algumas 
 * conversas, ficou decidido com os alunos que eles poderiam escolher 
 * a cor do uniforme entre branco ou vermelho. Assim sendo, Girafales 
 * precisa de sua ajuda para organizar as listas de quem quer o 
 * uniforme em cada uma das turmas, relacionando estas camisetas 
 * pela cor, tamanho (P, M ou G) e por �ltimo pelo nome.
 * 
 * Entrada
 * 
 * Cada caso de teste inicia com um valor N, (1 <= N <= 60) inteiro e 
 * positivo, que indica a quantidade de uniformes a serem feitas para 
 * aquela turma. As pr�ximas N*2 linhas cont�m informa��es de cada um 
 * dos uniformes (ser�o duas linhas de informa��o para cada uniforme). 
 * A primeira linha ir� conter o nome do estudante e a segunda linha 
 * ir� conter a cor do uniforme ("branco" ou "vermelho") seguido por 
 * um espa�o e pelo tamanho do uniforme "P" "M" ou "G".
 * A entrada termina quando o valor de N for igual a zero (0) e est� 
 * valor n�o dever� ser processado.
 * 
 * Sa�da
 * 
 * Para cada caso de entrada dever�o ser impressas as informa��es 
 * ordenadas pela cor em ordem ascendente, seguido pelos tamanhos 
 * em ordem descendente e por �ltimo por ordem ascendente de nome, 
 * conforme o exemplo abaixo.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class UniformesFinalAno {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int linhas = Integer.parseInt(st.nextToken());
		List<Uniforme> uniformes = new ArrayList<>();

		for (int i = 0; i <= linhas; i++) {
			var next = br.readLine();
			if (next.equals("0")) {
				break;
			}
			Uniforme uniforme = new Uniforme();
			uniforme.setNomeEstudante(next);
			var camiseta = br.readLine().split(" ");
			uniforme.setCorUniforme(camiseta[0]);
			uniforme.setTamUniforme(camiseta[1]);
			uniformes.add(uniforme);
		}
		Comparator<Uniforme> comparator = Comparator.comparing(Uniforme::getCorUniforme).reversed()
				.thenComparing(Uniforme::getTamUniforme).reversed().thenComparing(Uniforme::getNomeEstudante);

		uniformes.stream().sorted(comparator).forEach(System.out::println);
	}

	public static class Uniforme {
		private String nomeEstudante;
		private String corUniforme;
		private String tamUniforme;

		@Override
		public String toString() {
			return corUniforme + " " + tamUniforme + " " + nomeEstudante;
		}

		public String getNomeEstudante() {
			return nomeEstudante;
		}

		public void setNomeEstudante(String nomeEstudante) {
			this.nomeEstudante = nomeEstudante;
		}

		public String getCorUniforme() {
			return corUniforme;
		}

		public void setCorUniforme(String corUniforme) {
			this.corUniforme = corUniforme;
		}

		public String getTamUniforme() {
			return tamUniforme;
		}

		public void setTamUniforme(String tamUniforme) {
			this.tamUniforme = tamUniforme;
		}
	}
}
