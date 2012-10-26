

public class SaldoInsuficienteException extends Exception {
    public String getMessage() {
        return "O saldo atual � insuficiente para a opera��o.";
    }
}
