package factorymethod;

public class Boleto implements IPagamento {

    public String efetuarPagamento() {
        return "Boleto para pagamento gerado com sucesso.";
    }
}
