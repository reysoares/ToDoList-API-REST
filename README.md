# To-Do List com API REST

API para gerenciar tarefas (CRUD)

## Tecnologias

- Spring Boot  
- Spring MVC  
- Spring Data JPA  
- SpringDoc OpenAPI 3  
- MySQL  

## Práticas adotadas

- Princípios SOLID  
- DRY 
- YAGNI  
- KISS 
- API REST  
- Consultas com Spring Data JPA  
- Injeção de Dependências  
- Tratamento de respostas de erro  
- Geração automática da documentação Swagger com OpenAPI 3  

## Como Executar

1. Clone o repositório:

   ```bash
   git clone <URL_DO_REPOSITORIO>

2. Construa o Projeto:

    ```bash
    ./mvnw clean package

3. Execute a aplicação:
    ```bash
     java -jar target/todolist-0.0.1-SNAPSHOT.jar
    
A API estará disponível em http://localhost:8080.

A documentação Swagger poderá ser acessada em:
=> http://localhost:8080/swagger-ui.html

## API Endpoints
Para realizar as requisições abaixo, foi utilizada a ferramenta HTTPie.

✅ Criar Tarefa
        
        http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1


        [
          {
            "descricao": "Desc Todo 1",
            "id": 1,
            "nome": "Todo 1",
            "prioridade": 1,
            "realizado": false
          }
        ]
        
📋 Listar Tarefas

        http GET :8080/todos


        [
          {
            "descricao": "Desc Todo 1",
            "id": 1,
            "nome": "Todo 1",
            "prioridade": 1,
            "realizado": false
          }
        ]
        
✏️ Atualizar Tarefa

        http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2


        [
          {
            "descricao": "Desc Todo 1 Up",
            "id": 1,
            "nome": "Todo 1 Up",
            "prioridade": 2,
            "realizado": false
          }
        ]
        
❌ Remover Tarefa

        http DELETE :8080/todos/1

        
        []
