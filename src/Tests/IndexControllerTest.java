package Tests;

import Controllers.IndexController;

import java.sql.ResultSet;

class IndexControllerTest {

    @org.junit.jupiter.api.Test
    void consultasMarcadas() {
        ResultSet rs = IndexController.consultasMarcadas();
    }

    @org.junit.jupiter.api.Test
    void criarConsulta() {
        String[] valores = {"juliano","24/11/9999"};
        IndexController.criarConsulta(valores);
    }

    @org.junit.jupiter.api.Test
    void atualizarConsulta() {
        String[] valores = {"1","juliana","99/99/9999"};
        IndexController.atualizarConsulta(valores);
    }

    @org.junit.jupiter.api.Test
    void deletarConsulta() {
        String[] valores = {"1"};
        IndexController.deletarConsulta(valores);
    }
}