package org.example;

public class Veiculo {
    public String modelo;
    public double valorDiaria;
    public int diasAtrasados;


    public double calcularCusto(int dias) {
        if(dias == 0){
            return 0.0;
        }
        if(valorDiaria < 0){
            valorDiaria = 0;
        }
        return valorDiaria * dias;
    }

    public double desconto(int dias){
        if (dias > 7){
            return calcularCusto(dias) * 0.90;
        }
        return 0.0;
    }

    public int multa(int diasAtrasados){
        int multafixa =200;
        if (diasAtrasados > 0){
            return multafixa;
        }
        return 0;
    }
}

