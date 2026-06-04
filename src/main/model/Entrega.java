package model;

import service.Transportadora;

public class Entrega {

    private double distancia;

    private double peso;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularFrete() {

        String expressao =
                Transportadora.getFormulaFrete();

        expressao = expressao.replace(
                "distancia",
                Double.toString(distancia)
        );

        expressao = expressao.replace(
                "peso",
                Double.toString(peso)
        );

        return new interpreter.InterpretadorExpressoesFrete(
                expressao
        ).calcular();
    }
}