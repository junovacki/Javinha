import java.sql.*;

public class Connector {
    public static ResultSet realizaQuery(String where){

        try {
            Connection conn = conectarBanco();
            String sql = montagemQuery(where);
            PreparedStatement p =conn.prepareStatement(sql);

            return p.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static Connection conectarBanco(){
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/exercicio", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    public static String montagemQuery(String where){
        return "SELECT * FROM " + where;
    }
}
