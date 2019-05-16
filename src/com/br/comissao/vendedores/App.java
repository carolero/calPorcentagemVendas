package com.br.comissao.vendedores;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input identificação do vendedor
		System.out.println("Nome do vendedor:");
		String name = input.next();
		
		// Input código da peça
		System.out.println("Código da peça:");
		int item = input.nextInt();
		
		// Input valor da peça
		System.out.println("Valor da peça:");
		double price = input.nextDouble();
		
		// Input quantidade de peças vendidas
		System.out.println("Quantidade de peças vendidas:");
		int sales = input.nextInt();
		
		// Porcentagem de comissão
		int percentage = 5;
		
		// Calculo total de vendas
		double total = price * sales;
		
		// Calculo final para comissão
		double commission = (total * percentage)/100;
		
		// Print final para o usuário
		System.out.println("Sua comissão é de: R$ " + commission);
				
	}

}
