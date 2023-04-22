package Veiculo;

import exception.VelocidadeException;

public abstract class Veiculo {

    private int placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocidadeMax;
    private int quantidadeRodas;
    private final Motor motor;

    public Veiculo() {
        this.placa = 0;
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocidadeMax = 0;
        this.quantidadeRodas = 0;
        this.motor = new Motor();
    }

    public abstract void calculaVelocidade();

    final public void setVelocidadeMax(float velocidadeMax) throws VelocidadeException {
        float velMax = 110.0f;
        float velMin = 80.0f;
        if (velocidadeMax >= velMin && velocidadeMax <= velMax) {
            this.velocidadeMax = velocidadeMax;
        } else throw new VelocidadeException();
    }

    public int getPlaca() {
        return placa;
    }

    final public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    final public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    final public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    final public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocidadeMax() {
        return velocidadeMax;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    final public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public Motor getMotor() {
        return this.motor;
    }

}