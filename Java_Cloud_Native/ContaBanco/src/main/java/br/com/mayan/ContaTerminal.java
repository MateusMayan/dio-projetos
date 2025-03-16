package br.com.mayan;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        while (numero <= 0) {
            System.out.println("Número inválido, não pode criar uma conta com número negativo. Por favor, digite um número válido: ");
            numero = scanner.nextInt();
        }

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        while (saldo < 0) {
            System.out.println("Saldo inválido, não pode criar uma conta com saldo negativo. Por favor, digite um saldo válido: ");
            saldo = scanner.nextDouble();
        }

        System.out.println("Olá " + nome + ", obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + String.format("%.2f",saldo)+ " já está disponível para saque.");
    }
}