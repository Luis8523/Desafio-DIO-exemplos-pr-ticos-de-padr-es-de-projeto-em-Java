package com.dio.pagamento;

/**
 * Estratégia de pagamento via PIX.
 */
public class PagamentoPix implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via PIX.\n", valor);
    }
}