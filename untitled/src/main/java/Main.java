import org.example.Veiculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo carro = new Veiculo();

        System.out.println("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.println("Digite o valor da diária do veículo: ");
        double valorDiaria = scanner.nextDouble();

        System.out.println("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        System.out.println("O cliente atrasou a entrega em quantos dias? ");
        int diasAtrasados = scanner.nextInt();

        carro.modelo = modelo;
        carro.valorDiaria = valorDiaria;
        carro.diasAtrasados = diasAtrasados;

        double custoTotal = carro.calcularCusto(dias);
        double custoComDesconto = carro.desconto(dias);
        int multa = carro.multa(diasAtrasados);

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Custo total: R$" + custoTotal);
        System.out.println("Desconto aplicado: R$" + (custoTotal - custoComDesconto));
        System.out.println("Multa por atraso: R$" + multa);
        System.out.println("Total a pagar: R$" + (custoComDesconto + multa));

        scanner.close();
    }
}
