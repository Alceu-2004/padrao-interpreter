package service;

import interpreter.InterpretadorExpressao;
import interpreter.InterpretadorExpressoesFrete;

public class Transportadora {

    public static String formulaFrete =
            "distancia * 2 + peso";

    public static double calcularFrete(
            double distancia,
            double peso
    ) {

        String expressao;

        expressao =
                formulaFrete.replace(
                        "distancia",
                        Double.toString(distancia)
                );

        expressao =
                expressao.replace(
                        "peso",
                        Double.toString(peso)
                );

        InterpretadorExpressao interpretador =
                new InterpretadorExpressoesFrete(
                        expressao
                );

        return interpretador.interpretar();
    }
}