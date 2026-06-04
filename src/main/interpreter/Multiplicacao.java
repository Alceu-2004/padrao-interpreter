package interpreter;

public class Multiplicacao implements InterpretadorExpressao {

    private InterpretadorExpressao esquerda;
    private InterpretadorExpressao direita;

    public Multiplicacao(
            InterpretadorExpressao esquerda,
            InterpretadorExpressao direita
    ) {

        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double interpretar() {

        return esquerda.interpretar()
                * direita.interpretar();
    }
}