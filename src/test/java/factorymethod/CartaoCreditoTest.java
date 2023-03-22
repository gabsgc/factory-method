package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartaoCreditoTest {

    @Test
    void deveEfetuarPagamento() {
        IPagamento pagamento = PagamentoFactory.realizarPagamento("CartaoCredito");
        assertEquals("Transação efetuada com sucesso.", pagamento.efetuarPagamento());
    }
}