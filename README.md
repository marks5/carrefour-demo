<img width="696" alt="image" src="https://user-images.githubusercontent.com/6106197/227732319-18959d8e-3cb9-412e-8442-79a81b3c6625.png">

![image](https://user-images.githubusercontent.com/6106197/228066458-6cdb240a-1a1d-4836-99ac-2fe345cf8893.png)

# Instruções de local

Apontar para arquivo DemoApplication e rodar localmente, endereço está como localhost e porta 8080. A aplicação faz uso do h2 database, não e preciso se conectar em nenhum SGBD externo para tanto.

Também é possível rodar com os comandos

./gradlew build

./gradlew bootRun

# Instruções de consumo docker

docker build -t marks/demo .

docker run -p 8080:8080 marks/demo

# Instruções de consumo das APIs

![image](https://user-images.githubusercontent.com/6106197/228394664-1b67d46e-1c04-4af0-9893-7b3e9d30d683.png)

  /api/dashboard/debits -> Verifica lista de débitos
  
  /api/dashboard/credits -> Verifica lista de créditos
  
  /api/dashboard/consolidated -> Verifica o balanço do dia debits - credits dado dia atual

  /api/dashboard/consolidated/by?data=yyyy-MM-dd -> Verifica o balanço do dia correspondendo a data específica yyyy-MM-dd

  /api/transaction -> Insere um débito ou crédito por post no body 

// Sendo true define como débito, sendo falso define como crédito, claro que podemos melhorar isso criando duas tabelas a fim de melhorar o desempenho mas escolhi assim por se tratar de uma definiçao simplória.
O valor é um double e o débito/crédito é um booleano.

{
    "debito":true, 
    "valor":12000.00
}
