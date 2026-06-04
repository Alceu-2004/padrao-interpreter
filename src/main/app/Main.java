package app;

import model.Entrega;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "=== SMART DELIVERY ==="
        );

        Entrega entrega1 =
                new Entrega();

        entrega1.setDistancia(
                10
        );

        entrega1.setPeso(
                5
        );

        System.out.println(
                "Frete da entrega 1: R$ "
                        + entrega1.calcularFrete()
        );

        Entrega entrega2 =
                new Entrega();

        entrega2.setDistancia(
                20
        );

        entrega2.setPeso(
                8
        );

        System.out.println(
                "Frete da entrega 2: R$ "
                        + entrega2.calcularFrete()
        );
    }
}