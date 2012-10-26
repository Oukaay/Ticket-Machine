

public class SaldoInsuficienteException extends Exception {
    public String getMessage() {
        return "Seu saldo não é suficiente";
    }
}
