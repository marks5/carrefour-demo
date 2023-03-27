<img width="696" alt="image" src="https://user-images.githubusercontent.com/6106197/227732319-18959d8e-3cb9-412e-8442-79a81b3c6625.png">

![image](https://user-images.githubusercontent.com/6106197/228066458-6cdb240a-1a1d-4836-99ac-2fe345cf8893.png)

Instruções de local

Apontar para arquivo DemoApplication e rodar localmente, endereço está como localhost e porta 8080.

Instruções de consumo de docker

docker build -t marks/demo .

docker run marks/demo

Instruções de consumo das APIs

/api/dashboard

/api/transaction

@startuml
actor Comerciante as Foo1
entity      Transaction as Foo2
database    Database    as Foo3
Foo1 -> Foo2 : Insere debit/credit
note left: Json vai aqui

Foo2 -> Foo3 : Persiste debit/credit
Foo3 --> Foo2 : Recebe ok
Foo2 --> Foo1 : Recebe ok
@enduml
