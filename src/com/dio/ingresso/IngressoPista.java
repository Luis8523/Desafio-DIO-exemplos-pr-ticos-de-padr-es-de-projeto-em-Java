package com.dio.ingresso;

/**
 * Representa um ingresso do tipo pista.
 * Preço fixo de R$80,00.
 */
public class IngressoPista extends Ingresso {

    public IngressoPista() {
        this.tipo = "Pista";
        this.preco = 80.0;
    }
}