package com.dio.ingresso;

/**
 * Classe abstrata que representa um ingresso genérico.
 * Deve ser estendida por tipos específicos de ingresso (VIP, Pista, Comum, etc.).
 */
public abstract class Ingresso {

    protected String tipo;
    protected double preco;

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }
}