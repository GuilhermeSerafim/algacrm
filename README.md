# API Spring Boot para Cadastro de Clientes

Este é um projeto de API Spring Boot desenvolvido para o cadastro de clientes. A aplicação fornece endpoints para operações de criação, consulta e exclusão relacionadas aos dados dos clientes, incluindo informações de login, dados pessoais e dados de endereço.

## Configuração CORS

O arquivo `src/main/java/com/algaworks/crm/connection/CorsConfig.java` permite a origem `http://localhost:3000`, os métodos GET, POST, PUT e DELETE e o envio de credenciais. CORS controla o acesso entre origens no navegador e não substitui autenticação. O controller atual não declara um endpoint PUT.

## Endpoints da API

### Listar Todos os Clientes

- **URL:** `/clientes`
- **Método:** `GET`
- **Descrição:** Retorna uma lista de todos os clientes cadastrados.

### Buscar Cliente por ID

- **URL:** `/clientes/{id}`
- **Método:** `GET`
- **Descrição:** Retorna os detalhes de um cliente específico com base no ID fornecido.

### Buscar Cliente por Nome

- **URL:** `/clientes/nome/{nome}`
- **Método:** `GET`
- **Descrição:** Encaminha a consulta por nome ao serviço.

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

A classe `ClienteRepository` na pasta `com.algaworks.crm.repository` estende `JpaRepository` e fornece métodos auxiliares para operações de busca, como encontrar um cliente pelo nome (`findByNome`).

## Execução da Aplicação

1. Clone o repositório.
2. O `pom.xml` configura Java 11 e Spring Boot 2.7.15. Tenha Java e Maven compatíveis instalados.
3. Execute o aplicativo Spring Boot com o comando `mvn spring-boot:run`.

Para informações sobre a configuração do frontend, consulte o [README do frontend](src/main/java/com/algaworks/crm/view/algacrm/README.md). Seu `package.json` declara React, Material UI e os scripts `start`, `build` e `test`.

Sinta-se à vontade para explorar, contribuir ou adaptar o projeto conforme necessário para atender às suas necessidades específicas. Qualquer feedback é bem-vindo!

## Limites desta versão

O modelo `Cliente` inclui senha e dados pessoais; isso não representa um fluxo de autenticação validado. Não usar dados reais para experimentar o cadastro.
