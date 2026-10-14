# Terminal Bancário

Aplicação de console em Java que simula operações de uma conta bancária.

## Funcionalidades
- Consultar saldo (saldo inicial: R$ 1.000,00)
- Depósito (apenas valores maiores que zero)
- Saque (valida valor positivo e saldo suficiente)
- Atendimento limitado a 5 operações ou encerrado pelo usuário

## Tecnologias
Java 17+, Scanner, estruturas `for` e `switch`

## Como executar
javac TerminalBancario.java
java TerminalBancario

## Próximos passos
- Tratar entradas inválidas
- Separar a lógica em uma classe Conta
- Trocar double por BigDecimal
