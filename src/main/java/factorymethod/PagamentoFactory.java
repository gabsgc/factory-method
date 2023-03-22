package factorymethod;

public class PagamentoFactory {

    public static IPagamento realizarPagamento(String meioPagamento) {
        Class classe;
        Object objeto;

        try {
            classe = Class.forName("factorymethod." + meioPagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Meio de pagamento inexistente.");
        }
        if (!(objeto instanceof IPagamento)) {
            throw new IllegalArgumentException("Meio de pagamento inválido.");
        }
        return (IPagamento) objeto;
    }
}
