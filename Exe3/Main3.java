import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();

       int x = -1;

        while (x != 4) {
            System.out.println("--Escolha uma opção--\n1- Cadastrar uma conta\n2- Deposito\n3- Saque\n4- Sair");
            x = Integer.parseInt(leitor.nextLine());
            System.out.println(contas.toString());

            switch (x) {
                case 1:
                    cadastrar(contas);
                    break;
                case 2:
                    deposito(contas);
                    break;
                case 3:
                    saque(contas);
                    break;
                case 4:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void cadastrar(List<ContaBancaria> contas) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String titular = leitor.nextLine();
        ContaBancaria novaConta = new ContaBancaria(1, titular, 0);
        contas.add(novaConta);

        System.out.println("Conta cadastrada com sucesso:");
        System.out.println("Número da conta: " + novaConta.getNumeroConta());
        System.out.println("Titular da conta: " + novaConta.getTitular());
        System.out.println("Saldo atual: " + novaConta.getSaldo());
    }

    public static void deposito(List<ContaBancaria> contas) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        int numeroConta = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor de depósito:");
        float valor = Float.parseFloat(leitor.nextLine());

        ContaBancaria conta = encontrarContaPorNumero(contas, numeroConta);
        if (conta != null) {
            conta.deposito(valor);
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void saque(List<ContaBancaria> contas) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        int numeroConta = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor de saque:");
        float valor = Float.parseFloat(leitor.nextLine());

        ContaBancaria conta = encontrarContaPorNumero(contas, numeroConta);
        if (conta != null) {
            if (conta.getSaldo() >= valor) {
                conta.saque(valor);
                System.out.println("Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static ContaBancaria encontrarContaPorNumero(List<ContaBancaria> contas, int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}

