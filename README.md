# Javinha
Repositorio central do meu aprendizado em java

CRUD de consultas bem basico, apenas com dois campos. Segue codigo de criacao da tabela para funcionamento do codigo:


CREATE TABLE `tb_consulta` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(255) DEFAULT NULL,
  `data_consulta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
