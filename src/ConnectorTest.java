import static org.junit.jupiter.api.Assertions.*;
import java.sql.*;

class ConnectorTest {

    @org.junit.jupiter.api.Test
    void realizaQuery() {
        Connector.realizaQuery("tb_cliente");
    }

    @org.junit.jupiter.api.Test
    void conectarBanco() {
        Connector.conectarBanco();
    }

    @org.junit.jupiter.api.Test
    void montagemQuery() {
        String retorno = Connector.montagemQuery("tb_testeeeee");
        assertEquals(retorno,"SELECT * FROM tb_testeeeee");
    }
}