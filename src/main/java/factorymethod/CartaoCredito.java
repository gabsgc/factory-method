package factorymethod;

public class CartaoCredito implements IPagamento {

    public String efetuarPagamento() {
        return "Transação efetuada com sucesso.";
    }
}
