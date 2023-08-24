# Javinha
Repositorio central do meu aprendizado em java

Desafio da FGV com padrao da prova que irei fazer.

Descricao do desafio:

# Sistema de Kanban

## Referência

Prova da FGV de Auditor de Controle de Externo - Tecnologia da Informação: Readaptação de questão discursiva.

## Questão

Desenvolva um módulo em Java de sistema de kanban. Você deve desenvolver pelo menos uma aplicação de console, mas se desejar pode desenvolver uma aplicação desktop ou uma aplicação web. As únicas restrições são que não pode haver consulta na web e que não se deve utilizar frameworks. Além disso, para todo requisito funcional que será implementado, deve haver um teste, seja unitário ou dentro de um contexto de teste e2e. 

Configura zerar a prova, se nenhum requisito funcional for desenvolvido e/ou o nenhum teste for desenvolvido. Mesmo que desenvolva a aplicação inteira, se não desenvolver o teste do requisito é atribuída nota 0. Não receberá nota 0 caso pelo menos um requisito funcional for desenvolvido, bem como seu respectivo teste.

A estrutura de pastas e até o idioma de nomenclatura de atributos e métodos (como ingles, por exemplo) está a cargo do candidato. Nesse sentido, o candidato não será penalizado se fizer todas as classes na mesma pasta, por exemplo. Para uma melhor organização, faço a sugestão de separar pelo menos a aplicação dos testes, mas fica a critério do candidato.

O tempo de prova é de 2h30min.

Segue o levantamento de requisitos do sistema:

![](/.github/info.png "Créditos da imagem: FGV")

### Requisitos funcionais

- [ ] Deve ser possível cadastrar uma tarefa;
- [ ] Deve ser possível atualizar o status da tarefa;
- [ ] Deve ser possível listar as tarefas.

### Requisitos não funcionais

- [ ] Ao cadastrar uma tarefa, ela deve possuir o status "PARA FAZER";
- [ ] Ao atualizar o status de uma tarefa, deve ser possível progredir com uma tarefa como também regredir o status da tarefa (por exemplo do status "TRABALHANDO" para o status "PARA FAZER");
- [ ] Deve ser possível listar todas as tarefas, com seus respectivos status;
- [ ] Deve ser possível listar as tarefas por categoria.

Estes requisitos são as funcionalidades mínimas do sistema que deve entregar. Você também pode adicionar outros requisitos funcionais e não funcionais, mas se lembre do tempo de prova e das restrições citadas acima. O candidato não será penalizado se desenvolver mais requisitos, mas os requisitos citados acima são o mínimo que se deve entregar.

#### Status das tarefas

- PARA FAZER (estado inicial)
- TRABALHANDO
- ESPERANDO
- FEITO

### Testes

Você também deve criar pelo menos testes end-to-end (e2e) coerentes com as funcionalidades que implementar nas classes. Também é permitida a criação de testes de integração e unitários, mas leve em consideração o tempo de prova. Portanto, você é livre para optar dentre estas opções de teste, mas se deve testar pelo menos todos os requisitos funcionais da aplicação.

Bom teste!


