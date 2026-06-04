package interpreter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorExpressoesFrete
        implements InterpretadorExpressao {

    private InterpretadorExpressao interpretadorInicial;

    public InterpretadorExpressoesFrete(
            String contexto
    ) {

        Stack<InterpretadorExpressao> pilhaInterpretadores =
                new Stack<>();

        List<String> elementos =
                Arrays.asList(
                        contexto.split(" ")
                );

        Iterator<String> iterator =
                elementos.iterator();

        while (iterator.hasNext()) {

            String elemento =
                    iterator.next();

            if (elemento.matches("\\d+(\\.\\d*)?")) {

                pilhaInterpretadores.push(
                        new Numero(
                                Double.parseDouble(
                                        elemento
                                )
                        )
                );

            } else if (elemento.equals("+")) {

                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException(
                            "Expressão inválida"
                    );
                }

                Numero esquerda =
                        (Numero) pilhaInterpretadores.pop();

                Numero direita =
                        new Numero(
                                Double.parseDouble(
                                        iterator.next()
                                )
                        );

                Adicao interpretador =
                        new Adicao(
                                esquerda,
                                direita
                        );

                pilhaInterpretadores.push(
                        new Numero(
                                interpretador.interpretar()
                        )
                );

            } else if (elemento.equals("-")) {

                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException(
                            "Expressão inválida"
                    );
                }

                Numero esquerda =
                        (Numero) pilhaInterpretadores.pop();

                Numero direita =
                        new Numero(
                                Double.parseDouble(
                                        iterator.next()
                                )
                        );

                Subtracao interpretador =
                        new Subtracao(
                                esquerda,
                                direita
                        );

                pilhaInterpretadores.push(
                        new Numero(
                                interpretador.interpretar()
                        )
                );

            } else if (elemento.equals("*")) {

                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException(
                            "Expressão inválida"
                    );
                }

                Numero esquerda =
                        (Numero) pilhaInterpretadores.pop();

                Numero direita =
                        new Numero(
                                Double.parseDouble(
                                        iterator.next()
                                )
                        );

                Multiplicacao interpretador =
                        new Multiplicacao(
                                esquerda,
                                direita
                        );

                pilhaInterpretadores.push(
                        new Numero(
                                interpretador.interpretar()
                        )
                );

            } else if (elemento.equals("/")) {

                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException(
                            "Expressão inválida"
                    );
                }

                Numero esquerda =
                        (Numero) pilhaInterpretadores.pop();

                Numero direita =
                        new Numero(
                                Double.parseDouble(
                                        iterator.next()
                                )
                        );

                Divisao interpretador =
                        new Divisao(
                                esquerda,
                                direita
                        );

                pilhaInterpretadores.push(
                        new Numero(
                                interpretador.interpretar()
                        )
                );

            } else {

                throw new IllegalArgumentException(
                        "Expressão com elemento inválido"
                );
            }
        }

        interpretadorInicial =
                pilhaInterpretadores.pop();
    }

    @Override
    public double interpretar() {

        return interpretadorInicial.interpretar();
    }
}