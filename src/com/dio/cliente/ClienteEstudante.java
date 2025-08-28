package com.dio.cliente;

import com.dio.model.Endereco;
import com.dio.ingresso.Ingresso;

/**
 * Decorador que adiciona o comportamento de estudante a um cliente existente.
 * Aplica 15% de desconto adicional e altera a descrição.
 */
public class ClienteEstudante implements Cliente {

    private Cliente cliente;

    public ClienteEstudante(Cliente cliente) {
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
        return cliente.getTipoCliente() + ", Estudante";
    }

    @Override
    public double getDesconto() {
        return cliente.getDesconto() + 0.15;
    }
}