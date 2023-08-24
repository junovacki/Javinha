package Views;

import java.util.Scanner;
import Controllers.IndexController;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends IndexController{
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
       boolean continuarExecucao = true;
       while (continuarExecucao){
           int opcaoEscolhida = imprimeMenu();
           switch (opcaoEscolhida){
               default:
                   System.out.println("Insira um numero valido");
                   break;
               case 0:
                   continuarExecucao=false;
                   break;
               case 1:
                   cadastrarTarefa();
                   break;
               case 2:
                   atualizarTarefa();
                   break;
               case 3:
                   listarTarefas();
                   break;

           }
       }

    }

    public static int imprimeMenu(){
        System.out.println("----------------------------------");
        System.out.println("1 - Criar tarefa");
        System.out.println("2 - Atualizar tarefa");
        System.out.println("3 - Listar todas as tarefas");
        System.out.println("0 - Sair");
        System.out.println("----------------------------------");
        System.out.println("Insira a opcao: ");
        return teclado.nextInt();
    }

    public static void cadastrarTarefa(){
        System.out.println("Insira a descricao da tarefa");
        String descricao = teclado.next();
        IndexController.cadastrarTarefa(descricao);
    }

    public static void atualizarTarefa(){
        String[] params = new String [3];
        System.out.println("Insira o id da tarefa a ser atualizada");
        params[0] = teclado.next();
        System.out.println("Insira a descricao da tarefa");
        params[1] = teclado.next();
        System.out.println("Insira o status da tarefa");
        params[2] = teclado.next();
        IndexController.atualizarTarefa(params);
    }

    public static void listarTarefas(){
        ResultSet rs;
        System.out.println("Insira o ID do status_tarefa, caso ele exista sera filtrado por esse id.");
        int opcaoEscolhida = teclado.nextInt();
        switch (opcaoEscolhida){
            default:
                rs = IndexController.resgatarTarefas();
                break;
            case 1:
                rs = IndexController.resgatarTarefasFiltradas(1);
                break;
            case 2:
                rs = IndexController.resgatarTarefasFiltradas(2);
                break;
            case 3:
                rs = IndexController.resgatarTarefasFiltradas(3);
                break;
            case 4:
                rs = IndexController.resgatarTarefasFiltradas(4);
                break;
        }
        try {
            System.out.println("ID tarefa\t\tDescricao\t\tStatus tarefa");
            while (rs.next()){
                String id = rs.getString("id");
                String descricao = rs.getString("descricao_tarefa");
                String statusTarefa = rs.getString("nome_status_tarefa");
                System.out.println(id + "\t\t\t" + descricao
                        + "\t\t\t" + statusTarefa);
            }

        }catch (Exception exception){
            System.out.println("erro");
        }
    }
}