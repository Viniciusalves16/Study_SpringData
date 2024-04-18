# Study_SpringData
Repositório para auxiliar nos estudos de Spring Data.

-  Entities
-  Repositories
-  FetchType Eager/Lazy
-  @Query
-  OnetoMany e ManyToOne
-  @EntityGraph
-  @Modify
-  Cascade.ALL
-  ISO 8601 UTC Date

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/c3e12a51-6279-46e8-9737-c93b171bdae8)

Após utilizar as anotações do Spring Data 
-----------------------------------------
@Entity

@Table (name = " ")

E possível observar que o próprio Spring cria automaticamente as entidades como classes dentro da sua base de dados configurada.

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/85e28f96-3e0f-456f-8400-e162f675bad7)

-------------
Repositories 
--------------
Após a criação de uma interface extendendo de uma interface JpaRepository , utilizando como parametro a classe entitidade que será manipulada e o tipo da chave primária.

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/834674ed-beaa-4dd9-af21-786d4f9ba9ad)

--------------------
FetchType Eager/Lazy
---------------------
Após utilizar FetchType.Lazy é possível analisar que a consulta acaba buscando apenas os dados da tabela cliente conforme esta escrito na query abaixo.

"SELECT* FROM cliente WHERE id = ?1"

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/41fa5253-88e3-4ba6-9a0d-16964373c64f)

Porém quando utilizamos FetchType.EAGER identificamos que as duas tabelas que estão relacionadas acabam tendo acessos por mais que a query esteja buscando dados apenas de uma tabela.

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/15265a4f-e3cd-43b6-b9a6-4dc2657301df)

Isso pode ser um problema quando a aplicação recebe um relevante número de acessos e pode atrapalhar na performance.

--------------------
@Query
---------------------
Utilizado para quando o desenvolvedor deseja criar querys nativas ou não de acordo com sua preferência, além de permitir criar querys que o JpaRepository não possui dentro da sua interface.

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/ae4b81ca-d36e-4b23-b8dc-2d949689fe56)

--------------------
@ManyToOne / OneToMany
---------------------
Utilizando a Anotação @ManyToOne, estamos indicando o relacionamento entre a tabela cliente e endereco. Essa configuração indica que muitos clientes podem estar associados a um único endereço.

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/73793e3d-2b9e-43ac-b569-adb8dbada339)


Já a Anotação @OneToManyindica que um cliente pode ter muitos endereços diferentes. 

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/04c75d73-52f2-4426-a231-8c46d7a0d75b)

---------------------
@CascadeType.All
---------------------

O CascadeType.ALL é uma configuração em JPA (Java Persistence API) que especifica que todas as operações de persistência (CREATE, UPDATE, DELETE) feitas na entidade proprietária devem ser propagadas para as entidades associadas. Isso significa que se você fizer uma operação de persistência na entidade proprietária, as mesmas operações serão aplicadas às entidades associadas.

Atraves do método delete é possível visualizar que utilizando o @CascadeType.ALL  as ações delete na tabela Cliente acaba propagando a ação e excluindo tudo referente aquele usuário na tabela de endereço

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/ae633923-8812-4ae7-aaef-8d3d118941eb)



@CascadeType.ALL

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/56309f8e-d5ed-4ef5-82ec-3e93979c1f2f)

Sem utilização do @CascadeType.ALL

![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/2d1fe8a0-9144-4fb8-a7e0-b47457a85136)


---------------------
ISO 8601 UTC 
---------------------

Onde:

- **`YYYY`**: representa o ano com quatro dígitos.
- **`MM`**: representa o mês com dois dígitos (de 01 a 12).
- **`DD`**: representa o dia com dois dígitos (de 01 a 31).
- **`T`**: é o separador entre a data e a hora.
- **`HH`**: representa a hora com dois dígitos (de 00 a 23).
- **`MM`**: representa os minutos com dois dígitos (de 00 a 59).
- **`SS`**: representa os segundos com dois dígitos (de 00 a 59).
- **`Z`**: indica que o horário está em UTC (Tempo Universal Coordenado).

Por exemplo, se quisermos representar a data e hora atual em UTC no formato ISO 8601, seria algo assim:


![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/998d16a9-c672-48dd-8e84-436d2496a795)




![image](https://github.com/Viniciusalves16/Study_SpringData/assets/103587422/e5e9b1fe-67e2-41c9-83bb-320ccb83f4a0)





