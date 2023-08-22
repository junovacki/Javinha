import java.sql.*;
public class Model {
    public Model(){

    }

    public static ResultSet executaQuery(String query,int update){
        ResultSet rs = null;
        try{
            PreparedStatement ps = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/exercicio", "root", "root").prepareStatement(query);
            if(update == 0){
                rs = ps.executeQuery();
            }else{
                int i = ps.executeUpdate();
            }
        }catch (Exception exception){
            System.out.println("erro");
        }
        return rs;

    }

    public static ResultSet getAllConsultas(){
        String query = "SELECT * FROM tb_consulta";
        ResultSet rs = executaQuery(query,0);
        return rs;
    }

    public static void insertConsulta(String[] params){
        String query = "INSERT INTO tb_consulta (nome_cliente,data_consulta) VALUES ('"+params[0]+"','"+params[1]+"')";
        ResultSet rs = executaQuery(query,1);
    }

    public static void updateConsulta(String[] params){
        String query = "UPDATE tb_consulta SET nome_cliente = '"+params[1]+"', data_consulta = '"+params[2]+"' WHERE id = "+params[0];
        ResultSet rs = executaQuery(query,1);
    }
    public static void deleteConsulta(String[] params){
        String query = "DELETE FROM tb_consulta where id ="+params[0];
        ResultSet rs = executaQuery(query,1);
    }

}
