import interpreter.InterpretadorExpressoesFrete;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterpretadorExpressaoTest {

    @Test
    public void deveInterpretarAdicao() {

        InterpretadorExpressoesFrete interpretador =
                new InterpretadorExpressoesFrete(
                        "10 + 5"
                );

        Assertions.assertEquals(
                15,
                interpretador.interpretar()
        );
    }

    @Test
    public void deveInterpretarSubtracao() {

        InterpretadorExpressoesFrete interpretador =
                new InterpretadorExpressoesFrete(
                        "10 - 5"
                );

        Assertions.assertEquals(
                5,
                interpretador.interpretar()
        );
    }

    @Test
    public void deveInterpretarMultiplicacao() {

        InterpretadorExpressoesFrete interpretador =
                new InterpretadorExpressoesFrete(
                        "10 * 2"
                );

        Assertions.assertEquals(
                20,
                interpretador.interpretar()
        );
    }

    @Test
    public void deveInterpretarDivisao() {

        InterpretadorExpressoesFrete interpretador =
                new InterpretadorExpressoesFrete(
                        "20 / 2"
                );

        Assertions.assertEquals(
                10,
                interpretador.interpretar()
        );
    }

    @Test
    public void deveInterpretarExpressaoCompleta() {

        InterpretadorExpressoesFrete interpretador =
                new InterpretadorExpressoesFrete(
                        "10 * 2 + 5"
                );

        Assertions.assertEquals(
                25,
                interpretador.interpretar()
        );
    }
}