import org.example.Veiculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void testCalcularCusto() {
        Veiculo carro = new Veiculo();
        carro.valorDiaria = 100.0;
        double custo = carro.calcularCusto(5);
        assertEquals(500.0, custo, 0.01);
    }

    @Test
    void testDesconto() {
        Veiculo carro = new Veiculo();
        carro.valorDiaria = 100.0;

        double custoComDesconto = carro.desconto(10);
        double custoOriginal = carro.calcularCusto(10);
        double valorDoDesconto = custoOriginal - custoComDesconto;

        assertEquals(900.0, custoComDesconto, 0.01);
        assertEquals(100.0, valorDoDesconto, 0.01);
    }

    @Test
    void testMulta() {
        Veiculo carro = new Veiculo();
        carro.valorDiaria = 100.0;

        int multa = carro.multa(0);
        assertEquals(0, multa);

        multa = carro.multa(2);
        assertEquals(200, multa);
    }

    @Test
    void testTotalAPagar() {
        Veiculo carro = new Veiculo();
        carro.valorDiaria = 100.0;

        double custoTotal = carro.calcularCusto(5);
        double custoComDesconto = carro.desconto(10);
        int multa = carro.multa(2);

        double total = custoComDesconto + multa;

        assertEquals(1100.0, total, 0.01);
    }
}
