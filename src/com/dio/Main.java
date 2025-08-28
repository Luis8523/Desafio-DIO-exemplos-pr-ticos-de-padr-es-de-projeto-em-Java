package com.dio;
import java.util.Scanner;
import com.dio.model.Endereco;
import com.dio.model.Model;
import com.dio.ingresso.IngressoVip;
import com.dio.cliente.Cliente;
import com.dio.cliente.ClienteBase;
import com.dio.cliente.ClienteVip;
import com.dio.cliente.ClienteEstudante;
import com.dio.cliente.ClienteIdoso;
import com.dio.pagamento.PagamentoBoleto;
import com.dio.pagamento.PagamentoStrategy;
import com.dio.pagamento.PagamentoCartao;
import com.dio.pagamento.PagamentoPix;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturando dados do endereço
        System.out.println("Digite a rua:");
        String rua = scanner.nextLine();

        System.out.println("Digite a cidade:");
        String cidade = scanner.nextLine();
        Endereco endereco = new Endereco(rua, cidade);

        // Criando ingresso VIP
        IngressoVip ingresso = new IngressoVip();

        // Criando cliente base
        Cliente cliente = new ClienteBase(endereco, ingresso);

        // Perguntando os perfis do cliente com validação
        String resposta;

        do {
            System.out.println("O cliente é VIP? (s/n)");
            resposta = scanner.nextLine().trim().toLowerCase();
            if (!resposta.equals("s") && !resposta.equals("n")) {
                System.out.println("Opção inválida. Digite apenas 's' ou 'n'.");
            }
        } while (!resposta.equals("s") && !resposta.equals("n"));
        if (resposta.equals("s")) {
            cliente = new ClienteVip(cliente);
        }

        do {
            System.out.println("O cliente é Estudante? (s/n)");
            resposta = scanner.nextLine().trim().toLowerCase();
            if (!resposta.equals("s") && !resposta.equals("n")) {
                System.out.println("Opção inválida. Digite apenas 's' ou 'n'.");
            }
        } while (!resposta.equals("s") && !resposta.equals("n"));
        if (resposta.equals("s")) {
            cliente = new ClienteEstudante(cliente);
        }

        do {
            System.out.println("O cliente é Idoso? (s/n)");
            resposta = scanner.nextLine().trim().toLowerCase();
            if (!resposta.equals("s") && !resposta.equals("n")) {
                System.out.println("Opção inválida. Digite apenas 's' ou 'n'.");
            }
        } while (!resposta.equals("s") && !resposta.equals("n"));
        if (resposta.equals("s")) {
            cliente = new ClienteIdoso(cliente);
        }

        // Escolhendo forma de pagamento
        PagamentoStrategy pagamento;
        String forma; // ✅ Declaração da variável que estava faltando

        do {
            System.out.println("Escolha a forma de pagamento (cartao/pix/boleto): ");
            forma = scanner.nextLine().trim().toLowerCase();

            if (forma.equals("pix")) {
                pagamento = new PagamentoPix();
            } else if (forma.equals("boleto")) {
                pagamento = new PagamentoBoleto();
            } else if (forma.equals("cartao")) {
                pagamento = new PagamentoCartao();
            } else {
                pagamento = null;
                System.out.println("Forma de pagamento inválida. Tente novamente.");
            }
        } while (pagamento == null);

        // Processando a compra
        Model model = new Model(ingresso, cliente, pagamento);
        model.processarCompra();

        // Exibindo dados finais
        double desconto = cliente.getDesconto();
        System.out.println("Tipo de cliente: " + cliente.getTipoCliente());
        System.out.println("Desconto total: " + (desconto * 100) + "%");

        scanner.close();
    }
}