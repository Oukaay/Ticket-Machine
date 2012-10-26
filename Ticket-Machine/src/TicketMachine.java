


public class TicketMachine {
    private int saldo = 0;
    private int preco = 0;
    private int troco = 0;

    public TicketMachine(int preco) {
        this.preco = preco;
    }
    public void inserir(int quantia) throws NotainvalidaException {
        System.out.println("Validando nota inserida");

        if (quantia != 2 && quantia != 5 && quantia != 10
         && quantia != 20 && quantia != 50 && quantia != 100) {
            throw new NotainvalidaException();
        }

        this.saldo += quantia;

        System.out.println("Nota Valida.\nSaldo atual: " + this.saldo);
    }
    
    public String troco() throws TrocoInexistenteException {
        StringBuffer buffer = new StringBuffer();
        if(saldo == 0){
            throw new TrocoInexistenteException();
        }else {
            troco = saldo;
        }
        
        System.out.println("Troco =" + troco);
    return buffer.toString();
    }
    
    public String imprimir() throws SaldoInsuficienteException {
        StringBuffer buffer = new StringBuffer();
        if (saldo < preco) {
            throw new SaldoInsuficienteException();
        } else {
            saldo -= preco;
        }
        
        System.out.println("Imprimindo seu bilhete");
        System.out.println("-------------------------");
        System.out.println("Total: " + preco);
        System.out.println("Saldo atual: " + saldo + "");
        System.out.println("-------------------------");
        return buffer.toString();
    }
    public int getSaldo() {
        return saldo;
    }
 
}

