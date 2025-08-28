package com.dio.model;

import com.dio.ingresso.Ingresso;
import com.dio.cliente.Cliente;
import com.dio.pagamento.PagamentoStrategy;

/**
 * Classe responsável por orquestrar o processo de compra de ingressos.
 * Aplica o desconto do cliente e executa o pagamento conforme a estratégia definida.
 */
public class Model {

    private final Ingresso ingresso;
    private final Cliente cliente;
    private final PagamentoStrategy pagamento;

    public Model(Ingresso ingresso, Cliente cliente, PagamentoStrategy pagamento) {
        if (ingresso == null || cliente == null || pagamento == null) {
            throw new IllegalArgumentException("Parâmetros não podem ser nulos.");
        }
        this.ingresso = ingresso;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    /**
     * Processa a compra do ingresso, aplicando o desconto do cliente
     * e executando o pagamento.
     */
    public void processarCompra() {
        double precoOriginal = ingresso.getPreco();
        double desconto = cliente.getDesconto();
        double precoFinal = precoOriginal * (1 - desconto);

        System.out.println("🎟️ Tipo de ingresso: " + ingresso.getTipo());
        System.out.println("👤 Cliente: " + cliente.getTipoCliente());
        System.out.printf("💸 Desconto aplicado: %.0f%%%n", desconto * 100);
        System.out.printf("🧾 Preço final: R$ %.2f%n", precoFinal);

        pagamento.pagar(precoFinal);

        System.out.println("✅ Compra realizada com sucesso!");
    }
}
