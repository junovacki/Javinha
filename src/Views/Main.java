package Views;

import Controllers.IndexController;

import java.util.Scanner;
import java.sql.*;
public class Main extends IndexController {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        int opcaoEscolhida,continuar=0;
        while (continuar == 0){
            opcaoEscolhida = imprimeMenu();
            switch (opcaoEscolhida){
                case 0:
                    continuar = 1;
                    break;
                case 1:
                    verificarConsultasMarcadas();
                    break;
                case 2:
                    criarConsulta();
                    break;
                case 3:
                    deletarConsulta();
                    break;
                case 4:
                    alterarConsulta();
                    break;

            }
        }

    }
    public static int imprimeMenu(){
        System.out.println("---------------------------");
        System.out.println("1 - Verificar consultas marcadas");
        System.out.println("2 - Criar nova consulta");
        System.out.println("3 - Deletar consulta marcada");
        System.out.println("4 - Alterar consulta marcada");
        System.out.println("0 - Sair");
        System.out.println("---------------------------");
        System.out.println("Insira o numero da opcao: ");

        return teclado.nextInt();
    }

    public static void verificarConsultasMarcadas(){
        ResultSet rs = IndexController.consultasMarcadas();
        try {
            System.out.println("ID consulta\t\tNome\t\tData consulta");
            while (rs.next()) {
                String nomeCliente = rs.getString("nome_cliente");
                String id = rs.getString("id");
                String dataConsulta = rs.getString("data_consulta");
                System.out.println(id + "\t\t\t" + nomeCliente
                        + "\t\t\t" + dataConsulta);
            }
            Thread.sleep(2500);

        } catch (SQLException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void criarConsulta(){
        String[] array = new String[2];
        System.out.println("Insira o nome do cliente: ");
        array[0] = teclado.next();
        System.out.println("Insira a data da consulta: ");
        array[1] = teclado.next();
        IndexController.criarConsulta(array);
    }
    public static void deletarConsulta(){
        String[] array = new String[1];
        System.out.println("Insira o ID da consulta a ser removida: ");
        array[0] = teclado.next();
        IndexController.deletarConsulta(array);
    }
    public static void alterarConsulta(){
        String[] array = new String[3];
        System.out.println("Insira o ID da consulta a ser atualizada: ");
        array[0] = teclado.next();
        System.out.println("Insira o nome do cliente: ");
        array[1] = teclado.next();
        System.out.println("Insira a data da consulta: ");
        array[2] = teclado.next();
        IndexController.atualizarConsulta(array);
    }
}
