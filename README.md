# API Spring Boot para Cadastro de Clientes

Este é um projeto de API Spring Boot desenvolvido para o cadastro de clientes. A aplicação fornece endpoints para operações CRUD (Create, Read, Update, Delete) relacionadas aos dados dos clientes, incluindo informações de login, dados pessoais e dados de endereço.

## Configuração CORS

Para garantir a segurança e a integração adequada com o frontend, a API utiliza uma configuração CORS (Cross-Origin Resource Sharing). O arquivo `CorsConfig.java` na pasta `com.algaworks.crm.connection` define as configurações CORS para permitir solicitações de qualquer origem (*), apenas permitindo as operações GET, POST, PUT e DELETE. A configuração também permite o envio de credenciais, como cookies ou cabeçalhos de autorização.

## Endpoints da API

### Listar Todos os Clientes

- **URL:** `/clientes`
- **Método:** `GET`
- **Descrição:** Retorna uma lista de todos os clientes cadastrados.

### Buscar Cliente por ID

- **URL:** `/clientes/{id}`
- **Método:** `GET`
- **Descrição:** Retorna os detalhes de um cliente específico com base no ID fornecido.

### Adicionar Novo Cliente

- **URL:** `/clientes`
- **Método:** `POST`
- **Descrição:** Adiciona um novo cliente com base nos dados fornecidos no corpo da solicitação.

### Deletar Cliente

- **URL:** `/clientes/{id}`
- **Método:** `DELETE`
- **Descrição:** Deleta um cliente com base no ID fornecido.

## Modelo de Dados

O modelo de dados da aplicação é representado pela classe `Cliente` localizada na pasta `com.algaworks.crm.model`. A classe inclui campos para dados de login, dados pessoais e dados de endereço. A persistência dos dados é realizada utilizando o Spring Data JPA.

## Repositório

A classe `ClienteRepository` na pasta `com.algaworks.crm.repository` estende `JpaRepository` e fornece métodos auxiliares para operações de busca, como encontrar um cliente pelo nome ou sobrenome.

## Execução da Aplicação

1. Clone o repositório.
2. Certifique-se de ter o Java e o Maven instalados.
3. Execute o aplicativo Spring Boot com o comando `mvn spring-boot:run`.

Para informações sobre a configuração do frontend, consulte o README no diretório `view` do projeto.

Sinta-se à vontade para explorar, contribuir ou adaptar o projeto conforme necessário para atender às suas necessidades específicas. Qualquer feedback é bem-vindo!
