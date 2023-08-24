package Tests;

import Controllers.IndexController;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    @org.junit.jupiter.api.Test
    void cadastrarTarefa() {
        IndexController.cadastrarTarefa("Cadastro teste");
    }

    @org.junit.jupiter.api.Test
    void atualizarTarefa() {
        String[] params = {"1","atualizado pelo teste","4"};
        IndexController.atualizarTarefa(params);
    }

    @org.junit.jupiter.api.Test
    void resgatarTarefas() {
        IndexController.getAllTarefas();
    }

    @org.junit.jupiter.api.Test
    void resgatarTarefasFiltradas() {
        IndexController.getTarefas(4);
    }
}