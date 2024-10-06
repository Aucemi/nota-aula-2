import java.util.Scanner;

public class ContaPoupanca {
    private String titular;
    private double saldo;

    public ContaPoupanca(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Conta Poupança ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir Dados da Conta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    depositar(deposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    sacar(saque);
                    break;
                case 3:
                    exibirDados();
                    break;
                case 4:
                    System.out.println("Saindo da Conta Poupança...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}