# Sistema de Gerenciamento de Vendas com JDBC

Projeto desenvolvido durante a formação em Desenvolvimento Full Stack Java pela EBAC, com foco na implementação de persistência de dados utilizando Java, JDBC e PostgreSQL.

## Sobre o projeto

O projeto implementa uma estrutura de gerenciamento de clientes, produtos e vendas utilizando acesso direto ao banco de dados por meio do JDBC.

A aplicação foi organizada utilizando uma arquitetura baseada em DAO e Service, com classes genéricas para reutilização das operações de persistência.

O projeto também utiliza anotações próprias para relacionar classes e atributos às estruturas do banco de dados.

## Tecnologias utilizadas

- Java
- JDBC
- PostgreSQL
- SQL
- JUnit
- Maven/Java
- Git

## Principais funcionalidades

### Clientes

- Cadastro de clientes;
- Consulta de clientes;
- Alteração de clientes;
- Exclusão de clientes;
- Consulta por CPF.

### Produtos

- Cadastro de produtos;
- Consulta de produtos;
- Alteração de produtos;
- Exclusão de produtos.

### Vendas

- Cadastro de vendas;
- Consulta de vendas;
- Associação de produtos às vendas;
- Controle da quantidade de produtos;
- Cálculo do valor total da venda;
- Finalização de vendas;
- Cancelamento de vendas;
- Remoção de produtos;
- Controle do status da venda.

Os status disponíveis são:

- `INICIADA`
- `CONCLUIDA`
- `CANCELADA`

## Arquitetura

O projeto utiliza uma organização baseada nas camadas **Domain, DAO e Service**.

```text
Domain
  ↓
DAO
  ↓
Service
  ↓
PostgreSQL
