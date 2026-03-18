package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Account acc;
    
    System.out.println("Entre com o numero da conta: ");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("Entre com o nome do titular: ");
    String nome = sc.nextLine();
    System.out.println("Existe algum deposito inicial? (y/n)");
    String confirmacao = sc.nextLine();

    double deposit = 0.0;
     if (confirmacao.equalsIgnoreCase("y")) {
      System.out.println("Insira o valor de deposito inicial: ");
      deposit = sc.nextDouble();
      acc = new Account(n, nome, deposit);
     } else {
      acc = new Account(n, nome);
     }
     System.out.println();
     System.out.print(acc);
     System.out.println();

    int opcao = -1;
    while (opcao != 0) {
      System.out.println();
      System.out.println("Digite qual opcao deseja: ");
      System.out.println("1 - Depositar");
      System.out.println("2 - Sacar");
      System.out.println("3 - Ver dados");
      System.out.println("0 - Sair");
      opcao = sc.nextInt();
      
      if (opcao == 1) {
        System.out.println("Digite o valor a ser depositado: ");
        double valorDeposito = sc.nextDouble();
        acc.depositar(valorDeposito);
        System.out.print(acc);
        System.out.println();
      }
      else if (opcao == 2) {
        System.out.println("Digite o valor a sacar: ");
        double valorSaque = sc.nextDouble();
        acc.sacar(valorSaque);
        System.out.print(acc);
        System.out.println();
      }
      else if (opcao == 3) {
        System.out.println("Estes sao os dados da conta: ");
        System.out.print(acc);
        System.out.println();
      }
      else if (opcao == 0) {
        System.out.println("Encerrando sistema...");
      }
      else if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0) {
        System.out.println("Erro! Opcao Invalida. ");
      }

    }

    sc.close();
  }
}
