


public class TicketMachine {
    private int saldo = 0;
    private int preco = 0;

    public TicketMachine(int preco) {
        this.preco = preco;
    }
    public void inserir(int quantia) throws NotainvalidaException {
        System.out.println("Aguarde um momento... analisando papel-moeda...");

        if (quantia != 1 && quantia != 2 && quantia != 5 && quantia != 10
         && quantia != 20 && quantia != 50 && quantia != 100) {
            throw new NotainvalidaException();
        }

        this.saldo += quantia;

        System.out.println("Papel-moeda aceito.\nSaldo atual: " + this.saldo);
    }
    public String imprimir() throws SaldoInsuficienteException {
        StringBuffer buffer = new StringBuffer();
        if (saldo < preco) {
            throw new SaldoInsuficienteException();
        } else {
            saldo -= preco;
        }
        
        System.out.println("Imprimindo Bilhete...");
        System.out.println("-------------------------");
        System.out.println("Valor pago: " + preco);
        System.out.println("Saldo atual: " + saldo + "");
        System.out.println("-------------------------");
        return buffer.toString();
    }
    public int getSaldo() {
        return saldo;
    }
 
}

