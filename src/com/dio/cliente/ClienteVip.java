package com.dio.cliente;

import com.dio.model.Endereco;
import com.dio.ingresso.Ingresso;

/**
 * Decorador que adiciona o comportamento de cliente VIP.
 */
public class ClienteVip implements Cliente {

    private Cliente cliente;

    public ClienteVip(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public Endereco getEndereco() {
        return cliente.getEndereco();
    }

    @Override
    public Ingresso getIngresso() {
        return cliente.getIngresso();
    }

    @Override
    public String getTipoCliente() {
        return cliente.getTipoCliente() + ", VIP";
    }

    @Override
    public double getDesconto() {
        return cliente.getDesconto() + 0.15; // 15% de desconto adicional
    }
}