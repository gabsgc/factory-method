package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoDebitoTest {
    @Test
    void deveEfetuarPagamento() {
        IPagamento pagamento = PagamentoFactory.realizarPagamento("CartaoDebito");
        assertEquals("Transação efetuada com sucesso.", pagamento.efetuarPagamento());
    }

}