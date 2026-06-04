package interpreter;

public class InterpretadorExpressoesFrete {

    private String expressao;

    public InterpretadorExpressoesFrete(
            String expressao
    ) {

        this.expressao = expressao;
    }

    public double calcular() {

        String[] tokens =
                expressao.split(" ");

        InterpretadorExpressao resultado =
                new Numero(
                        Double.parseDouble(
                                tokens[0]
                        )
                );

        for (int i = 1; i < tokens.length; i += 2) {

            String operador =
                    tokens[i];

            InterpretadorExpressao numero =
                    new Numero(
                            Double.parseDouble(
                                    tokens[i + 1]
                            )
                    );

            switch (operador) {

                case "+":
                    resultado =
                            new Adicao(
                                    resultado,
                                    numero
                            );
                    break;

                case "-":
                    resultado =
                            new Subtracao(
                                    resultado,
                                    numero
                            );
                    break;

                case "*":
                    resultado =
                            new Multiplicacao(
                                    resultado,
                                    numero
                            );
                    break;

                case "/":
                    resultado =
                            new Divisao(
                                    resultado,
                                    numero
                            );
                    break;

                default:
                    throw new IllegalArgumentException(
                            "Operador inválido"
                    );
            }
        }

        return resultado.interpretar();
    }
}