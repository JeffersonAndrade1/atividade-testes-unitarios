package com.calculadora.prova.CalculadoraService;

import static org.junit.jupiter.api.Assertions.*;

import com.calculadora.prova.Models.Calculadora;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {

    @Test
    void testSomar() {
        assertEquals(5, new CalculadoraService(new Calculadora()).realizarOperacao(1, 2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(-1, new CalculadoraService(new Calculadora()).realizarOperacao(2, 2, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, new CalculadoraService(new Calculadora()).realizarOperacao(3, 2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, new CalculadoraService(new Calculadora()).realizarOperacao(4, 6, 3));
    }

    @Test
    void testPotencia() {
        assertEquals(8, new CalculadoraService(new Calculadora()).realizarOperacao(5, 2, 3));
    }

    @Test
    void testPorcentagem() {
        assertEquals(20, new CalculadoraService(new Calculadora()).realizarOperacao(6, 50, 40));
    }

    @Test
    void testRaizQuadrada() {
        assertEquals(3, new CalculadoraService(new Calculadora()).realizarOperacao(7, 9, 0));
    }

    @Test
    void testRaizCubica() {
        assertEquals(2, new CalculadoraService(new Calculadora()).realizarOperacao(8, 8, 0));
    }

    @Test
    void testMedia() {
        assertEquals(3, new CalculadoraService(new Calculadora()).realizarOperacao(9, 2, 4));
    }

    @Test
    void testMaior() {
        assertEquals(5, new CalculadoraService(new Calculadora()).realizarOperacao(10, 3, 5));
    }
}
