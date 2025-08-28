package com.dio.cliente;

import com.dio.model.Endereco;
import com.dio.ingresso.Ingresso;

public interface Cliente {
    Endereco getEndereco();
    Ingresso getIngresso();
    String getTipoCliente();
    double getDesconto();
}