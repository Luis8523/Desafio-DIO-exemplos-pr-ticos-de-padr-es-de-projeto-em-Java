package com.dio.pagamento;

/**
 * Estratégia de pagamento via cartão de crédito.
 */
public class PagamentoCartao implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado com Cartão de Crédito.\n", valor);
    }
}