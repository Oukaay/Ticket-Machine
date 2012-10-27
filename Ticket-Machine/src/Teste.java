

import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;


public class Teste {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preco = 3, op = 0;

        TicketMachine ticketMachine = new TicketMachine(preco);

        
        while (op == 0) {
            System.out.println("O que deseja fazer?\n" +
            		           "1-Inserir papel-moeda\n" +
                               "2-Imprimir bilhete\n" +
                               "3-Troco\n" +
                               "4 - Sair\n" +
                               "Numero: ");
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
                	System.out.println("A devolver troco, aguarde...");
                        ticketMachine.troco();
                	System.out.println("Troco devolvido.\n");
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
