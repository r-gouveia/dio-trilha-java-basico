package dio.contabanco.main;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá! Nos diga seu primeiro nome : ");
        String nome = scan.next();
        System.out.println("Nos diga seu segundo nome: ");
        String segNome = scan.next();

        System.out.println("Qual numero da sua conta? ");
        int numeroConta = scan.nextInt();

        System.out.println("Qual é a sua agencia? ");
        String agencia = scan.next();

        System.out.println("Seu saldo: ");
        float saldo = scan.nextFloat();

        System.out.println("Olá, "+ nome.concat(" ").concat(segNome) + "! obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numeroConta + " e seu saldo " + saldo +" já está disponível para saque");
    }
}
