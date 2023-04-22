package Veiculo.Passeio;

import Veiculo.Veiculo;
import gestao.veiculos.Calcular;

public final class Passeio extends Veiculo implements Calcular {

    private int quantidadePassageiros;

    Passeio() {
        this.quantidadePassageiros = 0;
    }

    public void calculaVelocidade() {
        float x = (getVelocidadeMax() * 1000);
        System.out.println("\n Velocidade do veículo de passeio: " + x + "m/h");
    }

    public int calcular() {
        int somaLetras = 0;

        somaLetras += getMarca().length();
        somaLetras += getModelo().length();
        somaLetras += getCor().length();

        return somaLetras;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

}