package com.dio.cliente;

import com.dio.ingresso.Ingresso;
import com.dio.model.Endereco;

/**
 * Classe abstrata que implementa o padrão Decorator para clientes.
 */
public abstract class ClienteDecorator implements Cliente {

    protected Cliente cliente;

    public ClienteDecorator(Cliente cliente) {
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
}