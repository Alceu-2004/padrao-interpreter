package interpreter;

public class Divisao implements InterpretadorExpressao {

    private InterpretadorExpressao esquerda;
    private InterpretadorExpressao direita;

    public Divisao(
            InterpretadorExpressao esquerda,
            InterpretadorExpressao direita
    ) {

        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double interpretar() {

        return esquerda.interpretar()
                / direita.interpretar();
    }
}