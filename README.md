<img width="696" alt="image" src="https://user-images.githubusercontent.com/6106197/227732319-18959d8e-3cb9-412e-8442-79a81b3c6625.png">

![image](https://user-images.githubusercontent.com/6106197/228066458-6cdb240a-1a1d-4836-99ac-2fe345cf8893.png)

# Instruções de local

Apontar para arquivo DemoApplication e rodar localmente, endereço está como localhost e porta 8080. A aplicação faz uso do h2 database, não e preciso se conectar em nenhum SGBD externo para tanto.

# Instruções de consumo de docker

docker build -t marks/demo .

docker run marks/demo

# Instruções de consumo das APIs

  /api/dashboard/debits -> Verifica lista de débitos
  
  /api/dashboard/credits -> Verifica lista de créditos
  
  /api/dashboard/{data} -> Verifica o balanço do dia

  /api/transaction -> Insere um débito ou crédito

{
    "debito":false,
    "valor":12000.26,
    "data":"2022-05-29"
}
