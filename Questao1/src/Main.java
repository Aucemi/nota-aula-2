import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.println("\nEscolha o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();

        if (tipoConta == 1) {
            ContaCorrente contaCorrente = new ContaCorrente(titular);
            contaCorrente.menu();
        } else if (tipoConta == 2) {
            ContaPoupanca contaPoupanca = new ContaPoupanca(titular);
            contaPoupanca.menu();
        } else {
            System.out.println("Tipo de conta inválido.");
        }
    }
}