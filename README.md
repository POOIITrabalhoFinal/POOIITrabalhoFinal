![Header](./Header.gif)

### Descrição:
O repositório POOIITrabalhoFinal armazena o Register System, nosso projeto e trabalho de conclusão da disciplina Programação Orientada a Objetos II (POOII) no Técnico em Informática no Colégio ULBRA São Lucas. Ele é um sistema com o objetivo de cadastrar o seguinte: Usuários, Clientes e Eventos, através de um Cadastro de Usuários e Clientes, e por fim Agenda, sendo capaz de fazer as operações CRUD.

## Ficha Ténica:

Desenvolvedores: @Xenoxys1 e @eduardahermannalmeida 

Linguagens:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)


Software:

![NetBeans IDE](https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white)
![Canva](https://img.shields.io/badge/Canva-%2300C4CC.svg?&style=for-the-badge&logo=Canva&logoColor=white)


Ícones:

https://www.iconfinder.com


## Arquitetura do Sistema

Na pasta VIEW há todos os JFrames e InternalJFrames necessários para a visualização do programa, eles são a base de tudo e servem para facilitar a interação com o sistema. Na pasta Source ficam todas as classes que são usadas no sistema, com suas respectivas
funções, variáveis e relações entre os frames de interação, em resumo, é a fonte de todo o código utilizado para o programa funcionar corretamente. A pasta IMG contém todas as imagens e ícones que foram utilizados para uma estilização mais consistente e agradável
para o programa, a maioria dos ícones foram todos tirados gratuitamente do site Iconfinder. Na biblioteca do nosso projeto, há todos os arquivos .jar utilizados para a conexão com o MySQL e algumas funções extras como data e hora.

![Arquitertura do Sistema](./arquiteturaDoSistema.png);


## Preview:


### Tela de Login
![Preview1](./telaLoginUpd.png)


### Tela de Cadastro para Usuários que não tem nenhum cadastro prévio.
![Preview2](./telaCadastroNovo.png)


### Tela Principal
![Preview3](./telaPrincipal.png)


### Tela de Cadastro de Usuários
![Preview4](./telaCadastroUsuario.png)


### Tela de Cadastro de Clientes
![Preview5](./telaCadastroCliente.png)


### Tela Agenda (para registro de eventos ou compromissos)
![Preview6](./telaAgenda.png)


## Instruções de execução e conexão com o banco de dados local


## Execução
O usuário será apresentado com uma tela de login, onde deverá colocar o seu nome de usuário e sua senha, caso o usuário não exista, o mesmo pode fazer cadastro para acessar o sistema. À partir disso, ele poderá escolher em uma barra de menu as seguintes opções: Cadastro de Usuários, Clientes, Agenda e Sair.

Na tela de cadastro de Usuários, pode se notar que é a mesma coisa que a tela de cadastro quando não se possui um usuário para login, porém a diferença é que você tem acesso à todos os comandos CRUD, podendo efetuar cadastro, edição, remoção e atualização de dados, contendo também uma função que executa uma pesquisa por ID. O mesmo se repete para a tela de clientes, que possui as mesmas funções mas com variáveis à mais, como endereço, telefone, email, cpf e cnpj. Tudo muda na tela de Agenda, onde se deve colocar informações mais complexas e funções diferentes, como atribuir um nome de cliente, uma data, um horário, uma descrição, uma pesquisa que automaticamente filtra os resultados de acordo com as informações jogadas no campo de texto e uma atualização automática na tabela da agenda, que ocorre cada vez que um dos processos do CRUD é feito.

Por fim, há uma função no momento em que você decide sair do programa, que pergunta se você deseja ou não continuar o processo e fechar o programa.

Todas as funções vem diretamente das classes DAO, que utilizam do ResultSet e do PreparedStatement para executar comandos do SQL com pontos de interrogação como índices, pegando as variáveis das suas respectivas classes DTO e utilizando-as de base com o uso de Getters e Setters onde são estabelecidos à partir das telas e dos campos de texto presentes nas mesmas, os métodos são executados quando o evento dos botões é iniciado, onde são criadas suas respectivas variáveis para se usar dos Setters que são transferidos de volta para o DTO após o mesmo objeto ser instanciado por um construtor, por fim é chamado o DAO, que executa o método desejado com a entrada de parâmetros do objeto DTO.


### Conexão 
O sistema em si funciona de uma forma um tanto simples, a conexão é feita à partir da classe ConexaoDAO que contém um método capaz de estabelecer a conexão do MySQL com o Java utilizando do driver mysql-connector-9.0.0 e consequentemente informar o usuário de erros através do Try-Catch Exception. À partir daí todas as classes como ClienteDAO, AgendaDAO, UsuarioDAO utilizam do mesmo método estabelecido no ConexaoDAO junto de outros comandos como PreparedStatement e ResultSet para suas ações.

### Scripts SQL

CREATE DATABASE  IF NOT EXISTS `bdtrabalhofinal`;
USE `bdtrabalhofinal`;


DROP TABLE IF EXISTS `tb_agenda`;


CREATE TABLE `tb_agenda` (
  `id_agenda` int NOT NULL AUTO_INCREMENT,
  `data_agenda` date NOT NULL,
  `hora` time NOT NULL,
  `descricao` varchar(150) NOT NULL,
  `nome_clientes` varchar(100) NOT NULL,
  PRIMARY KEY (`id_agenda`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `tb_agenda` WRITE;


UNLOCK TABLES;


DROP TABLE IF EXISTS `tb_clientes`;


CREATE TABLE `tb_clientes` (
  `id_clientes` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `endereco` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `telefone` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `email` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cpf_cnpj` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id_clientes`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs;


LOCK TABLES `tb_clientes` WRITE;


UNLOCK TABLES;


DROP TABLE IF EXISTS `tb_usuarios`;


CREATE TABLE `tb_usuarios` (
  `id_usuarios` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(250) NOT NULL,
  `nome_usuario` varchar(45) NOT NULL,
  `senha` varchar(32) NOT NULL,
  PRIMARY KEY (`id_usuarios`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `tb_usuarios` WRITE;


UNLOCK TABLES;

![Footer](./Footer.gif)

