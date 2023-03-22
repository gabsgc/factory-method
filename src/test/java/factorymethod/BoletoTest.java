package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoletoTest {

    @Test
    void deveEfetuarPagamento() {
        IPagamento pagamento = PagamentoFactory.realizarPagamento("Boleto");
        assertEquals("Boleto para pagamento gerado com sucesso.", pagamento.efetuarPagamento());
    }
}