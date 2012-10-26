

public class NotainvalidaException extends Exception {
    public String getMessage() {
        return "Nota invalida." +
               "Insira Notas de: R$ 2,00 | R$ 5,00 | R$ 10,00 | R$ 20,00 |" +
               "R$ 50,00 | R$ 100,00";
    }
}
