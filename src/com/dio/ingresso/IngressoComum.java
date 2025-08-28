package com.dio.ingresso;

/**
 * Representa um ingresso do tipo comum.
 * Preço fixo de R$50,00.
 */
public class IngressoComum extends Ingresso {

    public IngressoComum() {
        this.tipo = "Comum";
        this.preco = 50.0;
    }
}