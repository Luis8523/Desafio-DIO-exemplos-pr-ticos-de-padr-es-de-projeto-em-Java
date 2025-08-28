package com.dio.cliente;

import com.dio.model.Endereco;
import com.dio.ingresso.Ingresso;

/**
 * Decorador que adiciona o comportamento de cliente idoso.
 * Aplica 20% de desconto adicional e altera a descrição.
 */
public class ClienteIdoso implements Cliente {

    private Cliente cliente;

    public ClienteIdoso(Cliente cliente) {
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
        return cliente.getTipoCliente() + ", Idoso";
    }

    @Override
    public double getDesconto() {
        return cliente.getDesconto() + 0.20;
    }
}