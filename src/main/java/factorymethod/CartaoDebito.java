package factorymethod;

public class CartaoDebito implements IPagamento {
    @Override
    public String efetuarPagamento() {
        return "Transação efetuada com sucesso.";
    }
}
