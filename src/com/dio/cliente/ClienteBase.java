package com.dio.cliente;

import com.dio.ingresso.Ingresso;
import com.dio.model.Endereco;

public class ClienteBase implements Cliente {
    private Endereco endereco;
    private Ingresso ingresso;

    public ClienteBase(Endereco endereco, Ingresso ingresso) {
        this.endereco = endereco;
        this.ingresso = ingresso;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public Ingresso getIngresso() {
        return ingresso;
    }

    @Override
    public String getTipoCliente() {
        return "Base";
    }

    @Override
    public double getDesconto() {
        return 0.0;
    }
}