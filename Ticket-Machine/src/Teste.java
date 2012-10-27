

import java.util.Scanner;


public class Teste {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preco = 0, op = 0, qtde = 0;
        
        System.out.println("Quantos bilhetes deseja: ");
        qtde = scanner.nextInt();
        preco = qtde*3;
        TicketMachine ticketMachine = new TicketMachine(preco);

        
        while (op == 0) {
            System.out.println("1 - Inserir papel-moeda\n" +
                               "2 - Imprimir bilhete\n" +
                               "3 - Troco\n" +
                               "4 - Sair\n" +
                               "Opcao: ");
            op = scanner.nextInt();

            switch(op) {
                case 1:
                    try {
                        System.out.println("Insira o dinheiro");
                        ticketMachine.inserir(scanner.nextInt());
                    } catch (NotainvalidaException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    try {
                        System.out.println(ticketMachine.imprimir());
                    } catch(SaldoInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case 3:
                    try{
                	System.out.println(ticketMachine.troco());
                    } catch (TrocoInexistenteException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                   System.exit(0);
                    break;
                default:
                    System.out.println("ERRO! Opcao invalida. Tente novamente.\n");
                    break;
            }

            op = 0;
        }
    }

}
