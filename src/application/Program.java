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
     acc.dadosDaConta();

     System.out.println("Deseja adicionar algum valor? y/n "); 
     String confirmacao2 = sc.next();
     if (confirmacao2.equalsIgnoreCase("y")) {
      System.out.println("Insira o valor a ser depositado: ");
      double valorDeposito = sc.nextDouble();
      acc.depositar(valorDeposito);
      System.out.println();
      acc.dadosDaConta();
    } 

     System.out.println("Deseja retirar algum valor da sua conta? y/n "); 
     String confirmacao3 = sc.next();
     if (confirmacao3.equalsIgnoreCase("y")) {
      System.out.println("Insira o valor a ser retirado: ");
      double valorSaque = sc.nextDouble();
      acc.sacar(valorSaque);
      System.out.println();
      acc.dadosDaConta();
     }
    
    sc.close();
  }
}
