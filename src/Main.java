import java.sql.*;
import java.util.Scanner;
public class Main extends Model{
    public static void main(String[] args) {
        ResultSet rs = Model.dadosConsulta("");
        imprimeDados(rs);
    }

    public static void imprimeDados(ResultSet rs){
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nomeCliente = rs.getString("nome_cliente");
                Double valorEmConta = rs.getDouble("valor_em_conta");
                System.out.println(id + "\t\t\t" + nomeCliente
                        + "\t\t\t" + valorEmConta);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}