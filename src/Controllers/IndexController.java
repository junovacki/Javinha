package Controllers;
import Models.ConsultaModel;

import java.sql.ResultSet;
public class IndexController extends ConsultaModel {
    public static ResultSet consultasMarcadas(){
        return ConsultaModel.getAllConsultas();
    }

    public static void criarConsulta(String[] params){
        ConsultaModel.insertConsulta(params);
    }

    public static void deletarConsulta(String[] params){
        ConsultaModel.deleteConsulta(params);
    }

    public static void atualizarConsulta(String[] params){
        ConsultaModel.updateConsulta(params);
    }

}