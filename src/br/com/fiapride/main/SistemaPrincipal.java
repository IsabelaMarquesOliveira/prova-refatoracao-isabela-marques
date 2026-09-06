package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("ABC-1234", "Carlos");

        veiculo.adicionarCombustivel(-10);
        veiculo.adicionarCombustivel(50);
        veiculo.gastarCombustivel(100);

        System.out.println("Dono: " + veiculo.getMotorista() + " | Placa: " + veiculo.getPlaca() + " | Gasolina: " + veiculo.getCombustivel());
    }
}