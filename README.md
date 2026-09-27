# Sistema de Microserviços para Gerenciamento de Vendas

Projeto desenvolvido durante a formação em Desenvolvimento Full Stack Java pela EBAC, com aplicação prática de conceitos de arquitetura de microserviços.

## Sobre o projeto

O sistema é dividido em diferentes serviços responsáveis pelo gerenciamento de clientes, produtos e vendas.

Os principais serviços são:

- Cliente Service
- Produto Service
- Venda Service
- Config Server

Os serviços utilizam APIs REST para comunicação e possuem configurações centralizadas por meio do Spring Cloud Config.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Spring Cloud Config
- OpenFeign
- RestTemplate
- APIs REST
- Maven
- Lombok

## Principais funcionalidades

### Cliente Service
Gerenciamento de clientes, incluindo cadastro, consulta, atualização e exclusão.

### Produto Service
Gerenciamento de produtos, incluindo cadastro, consulta, atualização e exclusão.

### Venda Service
Gerenciamento de vendas e comunicação com os serviços de clientes e produtos.

### Config Server
Centralização das configurações utilizadas pelos microserviços.

## Arquitetura

O projeto utiliza uma arquitetura de microserviços, separando as responsabilidades da aplicação em serviços independentes.

```text
                    Config Server
                         |
          +--------------+--------------+
          |              |              |
          v              v              v
   Cliente Service  Produto Service  Venda Service
          |              |              |
          +--------------+--------------+
                         |
                      MongoDB
