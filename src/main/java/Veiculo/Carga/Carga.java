package Veiculo.Carga;

import Veiculo.Veiculo;
import gestao.veiculos.Calcular;

public final class Carga extends Veiculo implements Calcular {

    private int cargaMax;
    private int tara;

    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    public void calculaVelocidade() {
        float x = (getVelocidadeMax() * 10000);
        System.out.println("\n Velocidade do veículo de Veiculo.Carga: " + x + "cm/h");
    }

    public int calcular() {
        int somaNum = 0;

        somaNum += getMotor().getQuantidadePistao();
        somaNum += getMotor().getPontencia();
        somaNum += getQuantidadeRodas();
        somaNum += getVelocidadeMax();
        somaNum += getTara();
        somaNum += getCargaMax();

        return somaNum;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

}