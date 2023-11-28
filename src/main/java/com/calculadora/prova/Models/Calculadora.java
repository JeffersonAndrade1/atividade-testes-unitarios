package com.calculadora.prova.Models;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a / b;
    }

    public double potencia(int base, int expoente) {
        return Math.pow(base, expoente);
    }

    public double porcentagem(int valor, double percentual) {
        return valor * (percentual / 100);
    }

    public double raizQuadrada(int valor) {
        return Math.sqrt(valor);
    }

    public double raizCubica(int valor) {
        return Math.cbrt(valor);
    }

    public double media(int a, int b) {
        return (a + b) / 2.0;
    }

    public int maior(int a, int b) {
        return Math.max(a, b);
    }
}