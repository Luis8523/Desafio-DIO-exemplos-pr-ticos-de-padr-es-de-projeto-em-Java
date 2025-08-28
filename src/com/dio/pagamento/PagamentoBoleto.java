package com.dio.pagamento;

/**
 * Estratégia de pagamento via boleto bancário.
 */
public class PagamentoBoleto implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via Boleto Bancário.\n", valor);
    }
}