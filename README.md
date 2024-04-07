Estrutura do Projeto:

O projeto é organizado em três diretórios, cada um representando uma aplicação diferente:

api-client: Uma aplicação Java que atua como cliente.
api-restaurante: Uma outra aplicação Java que representa um serviço de restaurante.
api-reserva: Uma aplicação Java que gerencia reservas.
Configuração do Docker Compose:

O arquivo docker-compose.yml define a configuração para iniciar todas as aplicações e bancos de dados em conjunto:

Neste arquivo, definimos serviços para cada aplicação e para cada banco de dados PostgreSQL necessário. Além disso, configuramos as dependências entre os serviços para garantir que cada aplicação espere até que seu banco de dados correspondente esteja disponível.

Configuração das Aplicações:

Cada aplicação Java deve ser configurada para se conectar ao seu banco de dados PostgreSQL correspondente. Isso pode ser feito através de propriedades no arquivo de configuração da aplicação, como application.properties. Certifique-se de que as URLs de conexão do banco de dados correspondam aos serviços definidos no arquivo docker-compose.yml.
Vale lembrar que o nome utilizado no docker-composer.yml "postgres-client:" deve ser utlizado no
spring.datasource.url=jdbc:postgresql://postgres-client:5432/clientDB
Dessa forma cada aplicação vai conseguir acessar o seu banco de dados respectivo


Construção e Execução:

Para construir e executar todas as aplicações e bancos de dados juntos, basta navegar até o diretório do projeto no terminal e executar o comando:

Isso iniciará todos os serviços conforme configurado no arquivo docker-compose.yml, e suas aplicações estarão acessíveis nos respectivos URLs e portas configuradas.

Com esta configuração, você pode iniciar facilmente todo o ambiente de desenvolvimento com uma única execução do Docker Compose, facilitando o desenvolvimento, teste e implantação de suas aplicações.