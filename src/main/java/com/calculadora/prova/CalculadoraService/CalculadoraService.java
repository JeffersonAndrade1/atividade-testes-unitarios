package com.calculadora.prova.CalculadoraService;

import com.calculadora.prova.Models.Calculadora;
public class CalculadoraService {
    private final Calculadora calculadora;

    public CalculadoraService(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int realizarOperacao(int escolha, int valor1, int valor2) {
        switch (escolha) {
            case 1:
                return calculadora.somar(valor1, valor2);
            case 2:
                return calculadora.subtrair(valor1, valor2);
            case 3:
                return calculadora.multiplicar(valor1, valor2);
            case 4:
                return calculadora.dividir(valor1, valor2);
            case 5:
                return (int) calculadora.potencia(valor1, valor2);
            case 6:
                return (int) calculadora.porcentagem(valor1, valor2);
            case 7:
                return (int) calculadora.raizQuadrada(valor1);
            case 8:
                return (int) calculadora.raizCubica(valor1);
            case 9:
                return (int) calculadora.media((int) valor1, (int) valor2);
            case 10:
                return calculadora.maior((int) valor1, (int) valor2);
            default:
                throw new IllegalArgumentException("Operação inválida");
        }
    }
}