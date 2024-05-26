import classes.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o nome do titular:");
        String nome = scanner.next();

        System.out.println("Digite a agência:");
        String agencia = scanner.next();

        System.out.println("Digite o saldo da conta:");
        float saldo = scanner.nextFloat();

        Usuario usuario = new Usuario(numero, nome, agencia, saldo);

        System.out.println("Conta criada com sucesso.");

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Verificar saldo");
            System.out.println("4 - Informações da conta");
            System.out.println("5 - Sair");


            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    float deposito = scanner.nextFloat();
                    usuario.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    float saque = scanner.nextFloat();
                    usuario.sacar(saque);
                    System.out.println("Saque realizado com sucesso.");
                    break;
                case 3:
                    usuario.verSaldo();
                    break;
                case 4:
                    usuario.minhasInformacoes();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

    }
}