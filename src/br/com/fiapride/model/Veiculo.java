package br.com.fiapride.model;

public class Veiculo {

    private String placa;
    private String motorista;
    private double combustivel;

    public Veiculo(String placa, String motorista) {
        this.placa = placa;
        this.motorista = motorista;
        this.combustivel = 0.0;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getMotorista() {
        return this.motorista;
    }

    public double getCombustivel() {
        return this.combustivel;
    }

    private void setCombustivel(double valor) {
        if (valor < 0) {
            System.out.println("Não é permitido valor negativo.");
            return;
        }
        this.combustivel = valor;
    }

    public void adicionarCombustivel(double litros) {
        if (litros <= 0) {
            System.out.println("Não é permitido valor negativo.");
            return;
        }
        setCombustivel(this.combustivel + litros);
        System.out.println("Abastecido! O tanque agora esta com " + this.combustivel + "L.");
    }

    public void gastarCombustivel(double litros) {
        if (litros <= 0) {
            System.out.println("Não é permitido valor negativo.");
            return;
        }
        if (this.combustivel < litros) {
            System.out.println("Não tem combustível suficiente para essa distancia.");
            return;
        }
        setCombustivel(this.combustivel - litros);
        System.out.println("Percurso feito. Sobrou " + this.combustivel + "L no tanque.");
    }
}