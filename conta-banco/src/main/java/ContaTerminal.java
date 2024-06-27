import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    int numeroConta;
    String numeroAgencia;
    String nomeCliente;
    double saldo;


    Scanner scanner = new Scanner(System.in);
    System.out.print("Por favor, digite o número da conta: ");
    numeroConta = scanner.nextInt();
    System.out.print("Por favor, digite o número da agência: ");
    numeroAgencia = scanner.next();
    System.out.println("Por favor, digite seu nome: ");
    nomeCliente = scanner.next();
    System.out.println("Por favor, digite seu saldo: ");
    saldo = scanner.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldo);

    scanner.close();
  }

}
