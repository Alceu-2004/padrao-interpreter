package service;

public class Transportadora {

    private static String formulaFrete =
            "distancia * 2 + peso";

    public static String getFormulaFrete() {

        return formulaFrete;
    }

    public static void setFormulaFrete(
            String formulaFrete
    ) {

        Transportadora.formulaFrete =
                formulaFrete;
    }
}