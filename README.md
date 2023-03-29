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

<img width="564" alt="image" src="https://user-images.githubusercontent.com/6106197/228393391-45fd8588-4c36-4e99-b22b-f774f5d6476d.png">

  /api/dashboard/debits -> Verifica lista de débitos
  
  /api/dashboard/credits -> Verifica lista de créditos
  
  /api/dashboard/consolidated -> Verifica o balanço do dia debits - credits dado dia atual

  /api/transaction -> Insere um débito ou crédito
