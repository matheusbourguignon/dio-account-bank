package src.main;

import java.util.Scanner;

public class accountTerminal {
    public static void main(String[] args) {

        /*
        Atributo|Tipo       |Exemplo
        Numero  |Inteiro   |1021
        Agencia | Texto        |067-8
        NomeCliente |Texto |MARIO ANDRADE
        Saldo   |Decimal   |237.48
        */

        Scanner scanner = new Scanner(System.in);

        int num;
        String agency;
        String clientName;
        double balance;

        System.out.println("Por favor, digite o número da agência:");
        agency = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome:");
        clientName = scanner.nextLine();

        System.out.println("Digite o seu saldo:");
        balance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + num + " e seu saldo R$" + String.format("%.2f", balance) + " já está disponível para saque.");
        scanner.close();
    }
}
