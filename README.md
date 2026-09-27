# Sistema de Gerenciamento de Vendas com JPA e Hibernate

Projeto desenvolvido durante a formação em Desenvolvimento Full Stack Java pela EBAC, com foco na persistência e gerenciamento de dados utilizando JPA e Hibernate.

## Sobre o projeto

O projeto implementa um sistema para gerenciamento de clientes, produtos e vendas, utilizando Java e uma arquitetura organizada em camadas.

A aplicação utiliza o padrão DAO e uma camada de Services para separar as responsabilidades do sistema, além de realizar a persistência dos dados em um banco PostgreSQL por meio do JPA e Hibernate.

## Tecnologias utilizadas

- Java
- JPA
- Hibernate
- PostgreSQL
- JDBC
- JUnit
- Maven

## Principais funcionalidades

### Clientes
- Cadastro de clientes;
- Consulta de clientes;
- Atualização de clientes;
- Exclusão de clientes.

### Produtos
- Cadastro de produtos;
- Consulta de produtos;
- Atualização de produtos;
- Exclusão de produtos.

### Vendas
- Cadastro e gerenciamento de vendas;
- Associação de clientes às vendas;
- Associação de produtos às vendas;
- Gerenciamento das informações relacionadas às vendas.

## Arquitetura

O projeto utiliza uma organização em camadas, separando as responsabilidades entre:

```text
Entidades
    ↓
DAO
    ↓
Service
    ↓
Persistência com JPA/Hibernate
    ↓
PostgreSQL
