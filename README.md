# Study_SpringData
Repositório para auxiliar nos estudos de Spring Data.

-  Entities
-  Repositories
-  FetchType Eager/Lazy
-  @Query
-  OnetoMany e ManyToOne
-  @EntityGraph,
-  FetchMode SELECT/SUBSELECT/JOIN
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



