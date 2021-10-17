# fundecc-api
O projeto da API Rest foi desenvolvido em spring boot + maven + JPA + H2 Database.
Para executar, baixe o arquivo fundecc-backend-0.0.1-SNAPSHOT.jar pelo link https://drive.google.com/file/d/1LAFzwhZ4QATPfJJGwJ4TVeDcAeLyz7FT/view?usp=sharing e salve em alguma pasta e execute o comannado "java -jar fundecc-backend-0.0.1-SNAPSHOT.jar"
O maven criará o ambiente e o h2 criará um arquivo para o banco de dados na pasta database que tambem será criada no mesmo local onde o arquivo .jar for executado.
Para acessar os dados do H2 Database digite no browser http://localhost:8080/h2. O username é root e a senha 123456.
Os endpoints são: 
GET - htttp://localhost:8080/cargos
      htttp://localhost:8080/perfis
      htttp://localhost:8080/usuarios

POST - htttp://localhost:8080/cargos
       htttp://localhost:8080/perfis
       htttp://localhost:8080/usuarios

PUT -  htttp://localhost:8080/cargos
       htttp://localhost:8080/perfis
       htttp://localhost:8080/usuarios

DELETE - htttp://localhost:8080/perfis/"id"
