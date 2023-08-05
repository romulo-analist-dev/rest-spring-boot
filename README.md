# Rest Spring Boot Template - em construção

<p align="left">Projeto template para desenvolvimento de uma API completa.</p>

<h1 align="left">
Conceitos utilizados
</h1>
-	API REST com nível 3 de maturidade e um pouco mais </br>
-	Java 19.0.2 - OpenJDK GraalVM CE 22.3.1 </br>
-	<a href="https://spring.io">🔗</a>Spring 3.1.0 </br>
-   REST-assured </br>
-   Testcontainers </br>
-	Testes unitários (JUnit 5) </br>
-	Mockito </br>
-	Testes de integração </br>
-	Swagger </br>
-	Migrations com Flyway </br>
-	Content negociation(JSON, XML e YAML) </br>
-	Padrão de projeto VO(Value Object) </br>
-	HATEOAS(Hypermedia as the Engine of Application State) </br>
-	Autenticação com JWT e Spring Security </br>

<h1 align="left">
    Preparando o ambiente
</h1>

<h1 align="left">
    Banco de dados
</h1>
1.	Na raíz do projeto rode o comando 

```
docker compose up
```
<hr />
<h1 align="left">
    Documentação
</h1>
<hr />
<h1 align="left">
    Spring Docs
</h1>
1.	Para acessar a documentação dos endpoints: <a href="http://localhost:8080/v3/api-docs">http://localhost:8080/v3/api-docs</a>. <br />
2. ou <a href="http://localhost:8080/swagger-ui/index.html">http://localhost:8080/swagger-ui/index.html</a>. <br />

<h1 align="left">
    Postman
</h1>
1.	O diretório /Collections possui os arquivos das rotas para serem testadas via Postman bem como variáveis de ambiente para o mesmo, basta importá-los do Postman. <br />
2.  Caso precise atualizar as rotas para testar no Postman, basta acessar <a href="http://localhost:8080/v3/api-docs">http://localhost:8080/v3/api-docs</a>, copiar todo o JSON e importar no Postman.

<hr />
<h1 align="left">
    Testes
</h1>
<hr />
<h1 align="left">
    Testes de unitários e de integração
</h1>
1.	Basta ir na IDE com o projeto aberto e em src/test/java clicar em Run As > JUnit Test.

<hr />
<hr />
<h1 align="left">
    CORS e Security
</h1>
Em breve documentarei aqui, vamo com calma que ainda não tô com a vida ganha.

<hr />
<h1 align="left">
    Feedback e contato
</h1>