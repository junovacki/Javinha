package Models;
import java.sql.*;

public class TarefaModel {
    public static ResultSet conexaoBanco(String sql, int insere){
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/exercicio","root","root");
            PreparedStatement ps = conn.prepareStatement(sql);
            if (insere == 0){
                rs =  ps.executeQuery();
            }else {
                int i = ps.executeUpdate();


            }

        }catch (Exception exception){
            System.out.println("deu erro");
        }
        return rs;
    }

    public static void createTarefa(String params){
        String query = "INSERT INTO tb_tarefa (descricao_tarefa,status_tarefa) VALUES ('"+params+"',1)";
        ResultSet rs= conexaoBanco(query,1);
    }
    public static void updateTarefa(String[] params){
        String query = "UPDATE tb_tarefa SET descricao_tarefa = '"+params[1]+"', status_tarefa = "+params[2]+" WHERE id = "+params[0];
        ResultSet rs= conexaoBanco(query,1);

    }

    public static ResultSet getAllTarefas(){
        return conexaoBanco("SELECT * FROM tb_tarefa LEFT JOIN tb_status_tarefa ON tb_tarefa.status_tarefa = tb_status_tarefa.id_status_tarefa",0);
    }
    public static ResultSet getTarefas(int status){
        return conexaoBanco("SELECT * FROM tb_tarefa LEFT JOIN tb_status_tarefa ON tb_tarefa.status_tarefa = tb_status_tarefa.id_status_tarefa where status_tarefa = "+status,0);
    }
}
