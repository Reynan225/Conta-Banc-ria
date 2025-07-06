# Projeto: Sistema Bancário Simples (Conta Bancária)

Este projeto simula a criação e manipulação de uma conta bancária com funcionalidades básicas, utilizando Java e conceitos de Programação Orientada a Objetos (POO).

## Funcionalidades

- Criação de conta com ou sem depósito inicial
- Depósito de valores
- Saque de valores (com taxa fixa)
- Exibição dos dados atualizados da conta

## Estrutura

- `Account`: classe responsável pelos dados e operações da conta.
  - Construtores com e sem depósito inicial
  - Métodos: `deposit`, `withdraw`, `toString`
  - Taxa fixa de saque aplicada a cada operação
- `Program`: classe principal com interação via terminal para simular o uso do sistema.

## Regras de Negócio

- O depósito inicial é tratado como uma operação real de depósito, utilizando o método `deposit()`.
- O saque desconta uma taxa fixa de R$ 5.00.
- O saldo só pode ser alterado através dos métodos públicos da classe, garantindo o encapsulamento.

## Entrada e Saída

O programa solicita ao usuário dados da conta e permite realizar depósitos e saques, exibindo as informações atualizadas após cada operação.

## Observações

Este projeto foi desenvolvido com foco em boas práticas, como:

- Encapsulamento
- Construtores sobrecarregados
- Separação de responsabilidades
