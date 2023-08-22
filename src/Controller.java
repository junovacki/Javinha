import java.sql.ResultSet;
public class Controller extends Model{
    public int a =0;
    public Controller() {
        this.a = 1;
    }

    public static ResultSet consultasMarcadas(){
        return Model.getAllConsultas();
    }

    public static void criarConsulta(String[] params){
        Model.insertConsulta(params);
    }

    public static void deletarConsulta(String[] params){
        Model.deleteConsulta(params);
    }

    public static void atualizarConsulta(String[] params){
        Model.updateConsulta(params);
    }

    public static void escreverFrase(String frase){
        System.out.println(frase);
    }

    public static void incrementando(int parada){
        for (int i = 1; i <= parada; i++) {
            String frase = "i = " + i;
            escreverFrase(frase);
        }
    }
}