package org.example;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado, "La suma de 2 y 3 debe ser 5");
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 y 3 debe ser 2");
    }
}