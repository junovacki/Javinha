import java.sql.ResultSet;

public class Model extends Connector{
    public static ResultSet dadosConsulta(String where){
        return Connector.realizaQuery("tb_cliente "+where+";");
    }
}
