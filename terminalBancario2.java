import java.util.Scanner;

public class terminalBancario2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Requisito Funcional: Inicializar a conta com saldo inicial de R$ 1.000,00
        double saldo = 1000.00;
        
        // Requisito Funcional: Estrutura de repetição 'for' controlando até 5 operações
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- MENU DE ATENDIMENTO ---");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Encerrar Atendimento");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            // Estrutura de seleção 'switch' para tratar o menu
            switch (opcao) {
                case 1:
                    // Consultar Saldo
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;
                    
                case 2:
                    // Realizar Depósito
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    
                    // Regra de Negócio: Aceitar apenas valores estritamente maiores que zero (valor > 0)[cite: 1]
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.printf("Depósito realizado com sucesso! Novo saldo: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Valor inválido para depósito. O valor deve ser maior que R$ 0,00.");
                    }
                    break;
                    
                case 3:
                    // Realizar Saque
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    
                    // Regra de Negócio: Validar se é positivo e se não excede o saldo atual (valor <= saldo)[cite: 1]
                    if (valorSaque > 0 && valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f\n", saldo);
                    } else if (valorSaque > saldo) {
                        // Exibir "Saldo Insuficiente"[cite: 1]
                        System.out.println("Saldo Insuficiente");
                    } else {
                        System.out.println("Valor inválido para saque.");
                    }
                    break;
                    
                case 4:
                    // Regra de Negócio: Se o usuário digitar 4, ajustar a variável contadora do 'for' para interromper o laço[cite: 1]
                    System.out.println("Atendimento encerrado. Obrigado!");
                    i = 5; 
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        
        scanner.close();
    }
}