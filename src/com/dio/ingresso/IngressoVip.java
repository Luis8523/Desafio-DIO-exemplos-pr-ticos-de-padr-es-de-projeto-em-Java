package com.dio.ingresso;

/**
 * Representa um ingresso do tipo VIP.
 * Preço fixo de R$120,00.
 */
public class IngressoVip extends Ingresso {

    public IngressoVip() {
        this.tipo = "VIP";
        this.preco = 120.0;
    }
}