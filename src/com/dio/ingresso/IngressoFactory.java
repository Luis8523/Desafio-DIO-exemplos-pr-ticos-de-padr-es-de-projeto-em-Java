package com.dio.ingresso;

public class IngressoFactory {

    public static Ingresso criarIngresso(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "vip" -> new IngressoVip();
            case "pista" -> new IngressoPista();
            case "comum" -> new IngressoComum();
            default -> throw new IllegalArgumentException("Tipo de ingresso inválido: " + tipo);
        };
    }
}