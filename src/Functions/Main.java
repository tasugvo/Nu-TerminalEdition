package Functions;

import java.util.Scanner;

import Entities.contaBancaria;

public class Main {

	static Scanner sc = new Scanner(System.in);//Se necessario contruir scanner em cima de main para classe toda ter acesso

	public static void main(String[] args) {

		System.out.print("Coloque o numero da conta: ");
		int accountNumber = sc.nextInt();
		
		 // Consumir a quebra de linha pendente
		/*Quando você lê o número da conta (accountNumber) usando sc.nextInt(), ele deixa um caractere de nova linha no buffer. 
		 * Quando você lê a string (accountName) usando sc.nextLine() em seguida, ele consome esse caractere de nova linha imediatamente, resultando em uma string vazia.*/
		sc.nextLine();

		System.out.print("Coloque o nome do holder: ");
		String accountName = sc.nextLine();

		System.out.print("Voce fara algum deposito inicial ? (y/n): ");
		char selecao = sc.next().charAt(0);
		
		contaBancaria conta = new contaBancaria(accountNumber, accountName, 0);//contrução tem que ficar fora de escopo de condicionais e repetições
		
		if (selecao == 'y') {
			System.out.print("Coloque o valor inicial: ");
			double valor = sc.nextDouble();
			conta.setValorInicial(valor);
		} else if (selecao == 'n') {
			conta.setValorInicial(0);
		} else {
			System.out.println("Selecione um valor valido");
		}

		
	
		boolean key = true;
		while (key) {
			int caso = 0;
			System.out.println("\n	NuBank\n(1).Depositar\n(2).Sacar\n(3).Log da conta\n(4).Fechar programa");
			caso = sc.nextInt();
			switch (caso) {
			case 1:
				System.out.print("Por favor digite o valor que deseja depositar: ");
				double valor = sc.nextDouble();
				conta.setDeposito(valor);
				break;

			case 2:
				System.out.print("Por favor digite o valor que deseja sacar: ");
				double saque = sc.nextDouble();
				conta.setSaque(saque);
				break;

			case 3:
				System.out.print("\nNumero da conta: "+ conta.getAccountNumber()+"\nNome do proprietario: "+ conta.getAccountName()+"\n\nSaldo: "+conta.getAccountCash());
				break;

			case 4:
				key = !key;
				break;

			default:
				System.out.println("Por favor selecione um valor valido");
				break;
			}

		}
		
	}

	

}
