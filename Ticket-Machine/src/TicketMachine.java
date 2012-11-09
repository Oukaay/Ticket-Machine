
public class TicketMachine {
    private int saldo = 0;
    private int preco = 3;
    private int troco = 0;
    private int qtde;

    public TicketMachine(int qtdade) {
        this.qtde = qtdade;
    }
    
    public void inserir(int quantia) throws NotainvalidaException {
        System.out.println("Validando nota inserida");

        if (quantia != 2 && quantia != 5 && quantia != 10
         && quantia != 20 && quantia != 50 && quantia != 100) {
            throw new NotainvalidaException();
        }

        this.saldo += quantia;

        System.out.println("Nota Valida.\nSaldo atual R$: " + this.saldo);
    }
    
    public void troco() throws TrocoInexistenteException {
        
        if(saldo == 0){
            throw new TrocoInexistenteException();
        }else {
            troco = saldo;
            saldo = 0;
        }
        
        System.out.println("Retire seu troco R$: " + troco);
                
    }
  
    public String imprimirPassagem() throws SaldoInsuficienteException {
        StringBuffer buffer = new StringBuffer();
        int subtotal = preco*qtde;
        if (saldo < subtotal) {
            throw new SaldoInsuficienteException();
        } else {
            saldo -= subtotal;
            
        }
       
        System.out.println("Imprimindo seu bilhete");
        System.out.println("-------------------------");
        System.out.println("Total R$: " + subtotal);
        System.out.println("Saldo atual R$: " + saldo + "");
        System.out.println("-------------------------");
        return buffer.toString();
    }
    public int getSaldo() {
        return saldo;
    }
 
}

