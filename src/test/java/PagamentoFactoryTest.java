import factorymethod.IPagamento;
import factorymethod.PagamentoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {

    @Test
    void quandoPagamentoForInexistente_deveRetornarExcecao() {
        try {
            IPagamento pagamento = PagamentoFactory.realizarPagamento("Pix");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Meio de pagamento inexistente.", e.getMessage());
        }
    }

    @Test
    void quandoPagamentoForInvalido_deveRetornarExcecao() {
        try {
            IPagamento pagamento = PagamentoFactory.realizarPagamento("Crediario");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Meio de pagamento inválido.", e.getMessage());
        }
    }
}