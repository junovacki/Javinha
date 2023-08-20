// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.sql.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Connection conn ;
        PreparedStatement p = null;
        ResultSet rs = null;
        try {
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/exercicio", "root", "root");
            String sql = "select * from tb_cliente";
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();
            System.out.println("id\t\tname\t\temail");

            // Condition check
            while (rs.next()) {

                int id = rs.getInt("id");
                String nomeCliente = rs.getString("nome_cliente");
                Double valorEmConta = rs.getDouble("valor_em_conta");
                System.out.println(id + "\t\t" + nomeCliente
                        + "\t\t" + valorEmConta);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}