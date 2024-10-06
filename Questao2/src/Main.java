import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo de espera (minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Digite o valor da tarifa base: ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Digite o fator de demanda: ");
        double fatorDemanda = scanner.nextDouble();

        UberCorrida corrida = new UberCorrida(distancia, tempoEspera, tarifaBase, fatorDemanda);

        corrida.exibirDetalhesCorrida();
    }
}