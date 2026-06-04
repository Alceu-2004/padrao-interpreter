import model.Entrega;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EntregaTest {

    @Test
    public void deveCalcularFreteEntrega1() {

        Entrega entrega = new Entrega();

        entrega.setDistancia(10);
        entrega.setPeso(5);

        Assertions.assertEquals(
                25.0,
                entrega.calcularFrete()
        );
    }

    @Test
    public void deveCalcularFreteEntrega2() {

        Entrega entrega = new Entrega();

        entrega.setDistancia(20);
        entrega.setPeso(8);

        Assertions.assertEquals(
                48.0,
                entrega.calcularFrete()
        );
    }

    @Test
    public void deveRetornarDistancia() {

        Entrega entrega = new Entrega();

        entrega.setDistancia(15);

        Assertions.assertEquals(
                15,
                entrega.getDistancia()
        );
    }

    @Test
    public void deveRetornarPeso() {

        Entrega entrega = new Entrega();

        entrega.setPeso(7);

        Assertions.assertEquals(
                7,
                entrega.getPeso()
        );
    }
}