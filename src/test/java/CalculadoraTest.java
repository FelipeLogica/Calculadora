import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 22:39
 * @category Test
 */
class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    /**
     * Testa o método somar()
     */
    @org.junit.jupiter.api.Test
    void somar() {
        calculadora.setNumero1(10);
        calculadora.setNumero2(10);
        assertEquals(20.0, calculadora.somar());
    }

    /**
     * Testa o método subtrair()
     */
    @org.junit.jupiter.api.Test
    void subtrair() {
        calculadora.setNumero1(18);
        calculadora.setNumero2(10);
        assertEquals(8.0, calculadora.subtrair());
    }

    /**
     * Testa o método multiplicar()
     */
    @org.junit.jupiter.api.Test
    void multiplicar() {
        calculadora.setNumero1(10);
        calculadora.setNumero2(10);
        assertEquals(100.0, calculadora.multiplicar());
    }

    /**
     * Testa o método dividir()
     */
    @org.junit.jupiter.api.Test
    void dividir() {
        calculadora.setNumero1(10);
        calculadora.setNumero2(10);
        assertEquals(1.0, calculadora.dividir());
    }

    /**
     * Testa o método toString()
     */
    @org.junit.jupiter.api.Test
    void testToString() {
        calculadora.setNumero1(10);
        calculadora.setNumero2(10);
        assertEquals("\nPrimeiro numero: 10.0\nSegundo numero: 10.0\nSoma: 20.0\nSubtração: 0.0\nMultiplicação: 100.0\nDivisão: 1.0", calculadora.toString());

    }
}