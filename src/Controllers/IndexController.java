package Controllers;
import Models.TarefaModel;
import java.sql.ResultSet;

public class IndexController extends TarefaModel {
    public static void cadastrarTarefa(String params){
        TarefaModel.createTarefa(params);
    }
    public static void atualizarTarefa(String[] params){
        TarefaModel.updateTarefa(params);
    }
    public static ResultSet resgatarTarefas(){
        return TarefaModel.getAllTarefas();
    }

    public static ResultSet resgatarTarefasFiltradas(int status){
        return TarefaModel.getTarefas(status);
    }
}
