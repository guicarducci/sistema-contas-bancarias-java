package entities;

public class Account {
  
  private int accountNumber;
  private String titular;
  private double saldo;

  public Account(int accountNumber, String titular, double saldo) {
    this.accountNumber = accountNumber;
    this.titular = titular;
    this.saldo = saldo;
  }
  public Account(int accountNumber, String titular) {
    this.accountNumber = accountNumber;
    this.titular = titular;
  }

  public void dadosDaConta () {
     System.out.println("Conta: " + accountNumber + " | Titular: " + titular + " | Saldo: R$ " + saldo);
  }

  public double saldoDaConta() {
    return saldo;
  }
  public void depositar(double valor) { 
   if (valor > 0) {
    saldo += valor;
   } else {
    System.out.println("Valor de deposito invalido. ");
   }
   }
  public void sacar(double valor) {
   if (saldo >= valor + 5.0) {
       saldo -= valor + 5.0;
   } else {
    System.out.println("Saldo insuficiente para saque!");
   }
  }
  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }


  
}
