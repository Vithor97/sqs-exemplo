
# Spring Boot e LocalStack Integration Example

## Overview

Este projeto demonstra a utilização do Spring Boot 3 com LocalStack para desenvolver e testar aplicações que interagem com serviços AWS, como o Amazon SQS, localmente. O projeto é desenvolvido usando Java 17.

## Technologies Used

- **Java 17**: A versão mais recente e estável do Java para desenvolvimento.
- **Spring Boot 3**: Framework para facilitar a configuração e o desenvolvimento de aplicações Spring.
- **LocalStack**: Fornece um ambiente AWS cloud stack localmente, que permite testar os serviços da AWS sem custo.
- **Docker Compose**: Utilizado para definir e rodar o ambiente LocalStack.

## Prerequisites

Antes de começar, certifique-se de que você tem o seguinte software instalado:
- **Java JDK 17**: Necessário para compilar e executar o projeto Spring Boot.
- **Maven**: Usado para gerenciar dependências e construir o projeto.
- **Docker**: Necessário para executar o LocalStack.
- **Docker Compose**: Usado para orquestrar múltiplos containers Docker, incluindo o LocalStack.

## Setup

1. **Clone the Repository**
   Clone este repositório para obter a aplicação de exemplo:
   ```bash
   git clone [URL do Repositório]
   cd [Nome do Diretório]
   ```

2. **Build the Application**
   Compile a aplicação usando Maven:
   ```bash
   mvn clean install
   ```

   3. **Start LocalStack**
      Inicie o LocalStack usando Docker Compose dentro da pasta `localstack`:
      ```bash
      docker-compose up -d
      ```

## Running the Application

Após iniciar o LocalStack, você pode rodar sua aplicação Spring Boot usando:
```bash
java -jar target/[nome-do-arquivo-jar-gerado].jar
```

## Interacting with the Application

A aplicação permite interagir com a fila SQS simulada no LocalStack. Você pode adicionar mensagens à fila e consumi-las através dos endpoints expostos pela aplicação.

a collection para executar via Postman/Insomnia está na pasta ``collection``

## Stopping the Application

Para parar a aplicação e o LocalStack:
```bash
docker-compose down
```

## Cleaning Up

Para limpar todos os recursos criados pelo Docker Compose, incluindo volumes:
```bash
docker-compose down --volumes
```

