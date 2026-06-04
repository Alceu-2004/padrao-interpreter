package interpreter;

public class Subtracao implements InterpretadorExpressao {

    private InterpretadorExpressao esquerda;
    private InterpretadorExpressao direita;

    public Subtracao(
            InterpretadorExpressao esquerda,
            InterpretadorExpressao direita
    ) {

        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double interpretar() {

        return esquerda.interpretar()
                - direita.interpretar();
    }
}