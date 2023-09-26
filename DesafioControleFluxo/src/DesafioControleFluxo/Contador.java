/*
 * @author Luis Palmeira
 * @version 1.0
 * @since 26/09/2023
 */

/*
O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá 
		obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo:
 		"Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de 
		ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
*/


package DesafioControleFluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		try {
			Scanner terminal = new Scanner(System.in);
			
			System.out.println("Digite o primeiro parâmetro");
			int numeroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int numeroDois = terminal.nextInt();
			
			contar(numeroUm, numeroDois);
			terminal.close();
			
		}
		catch(ParametrosInvalidosException e) {
			
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
			
		}
		catch(InputMismatchException i) {
			System.out.println("Entrada deve ser numerica.");
		}
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroDois < parametroUm)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for(int numero = 0; numero < contagem; numero++) {
			
			System.out.println("Imprimindo o número " + (numero + 1));						
		}		
	}
}
