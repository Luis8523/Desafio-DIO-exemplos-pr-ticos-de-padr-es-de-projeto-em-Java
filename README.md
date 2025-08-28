# Desafio DIO - Exemplos praticos de patroes de projetos em Java
Exemplos práticos de padrões de projeto em Java.
# Explorando Padrões de Projeto na Prática com Java

Projeto desenvolvido como parte do desafio da [Digital Innovation One (DIO)](https://www.dio.me), com o objetivo de aplicar os principais **padrões de projeto (Design Patterns)** utilizando **Java puro**.

## 🧠 Padrões de Projeto Utilizados

- **Strategy**: para selecionar diferentes formas de pagamento (Pix, Cartão, Boleto).
- **Decorator**: para compor perfis de cliente (VIP, Estudante, Idoso) de forma dinâmica.
- **Model**: encapsula o processo de compra, integrando ingresso, cliente e pagamento.

## 📌 Funcionalidades

- Entrada de dados via terminal (rua, cidade, perfil do cliente).
- Escolha da forma de pagamento com validação.
- Cálculo de desconto com base no tipo de cliente.
- Exibição do tipo de cliente e desconto aplicado.

## 📦 Estrutura do Projeto
src/ └── main/ └── java/ └── com/ └── dio/ ├── cliente/ ├── ingresso/ ├── model/ ├── pagamento/ └── Main.java


## 🚀 Como Executar

1. Clone o repositório:
   git clone https://github.com/Luis8523/Explorando-Padroes-de-Projetos-na-Pratica-com-Java.git

2. 	Compile e execute o projeto:
javac -d out src/main/java/com/dio/Main.java
java -cp out com.dio.Main
💡 Alternativamente, abra o projeto no IntelliJ IDEA e execute diretamente a classe MAIN .

---

### 👨‍💻 Autor

 [Luís](https://github.com/Luis8532)
