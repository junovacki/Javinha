import java.sql.ResultSet;

class ModelTest {

    @org.junit.jupiter.api.Test
    ResultSet getAllConsultas() {
        ResultSet rs = getAllConsultas();
        return rs;
    }

    @org.junit.jupiter.api.Test
    void insertConsulta() {
        String[] valores = {"juliano","24/11/9999"};
        Model.insertConsulta(valores);
    }

    @org.junit.jupiter.api.Test
    void updateConsulta() {
        String[] valores = {"1","juliana","99/99/9999"};
        Model.updateConsulta(valores);
    }

    @org.junit.jupiter.api.Test
    void deleteConsulta() {
        String[] valores = {"1"};
        Model.deleteConsulta(valores);
    }
}