import java.util.Scanner;

public class ContaCorrente {
    private String titular;
    private double saldo;
    private double chequeEspecial;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.chequeEspecial = 1000.0;
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

    public void usarChequeEspecial(double valor) {
        if (valor <= chequeEspecial) {
            chequeEspecial -= valor;
            saldo += valor;
            System.out.println("Usou R$ " + valor + " do cheque especial.");
        } else {
            System.out.println("Limite do cheque especial excedido.");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Cheque Especial disponível: R$ " + chequeEspecial);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Conta Corrente ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Usar Cheque Especial");
            System.out.println("4. Exibir Dados da Conta");
            System.out.println("5. Sair");
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
                    System.out.print("Digite o valor do cheque especial: ");
                    double valorChequeEspecial = scanner.nextDouble();
                    usarChequeEspecial(valorChequeEspecial);
                    break;
                case 4:
                    exibirDados();
                    break;
                case 5:
                    System.out.println("Saindo da Conta Corrente...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}