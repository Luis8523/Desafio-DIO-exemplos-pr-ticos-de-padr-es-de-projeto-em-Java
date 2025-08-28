package com.dio.pagamento;

/**
 * Interface que define o contrato para estratégias de pagamento.
 * Cada implementação deve definir como o pagamento será processado.
 */
public interface PagamentoStrategy {

    /**
     * Realiza o pagamento de um valor específico.
     *
     * @param valor Valor a ser pago
     */
    void pagar(double valor);
}