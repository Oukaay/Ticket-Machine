

public class Nota {
    private int preco, qtd;

    public Nota(int val, int qtd) {
        this.preco = val;
        this.qtd = qtd;
    }
    public int getQtd() {
        return qtd;
    }
    public double getVal() {
        return preco;
    }
    public String toString() {
        return " Valor: " + preco;
    }
}
