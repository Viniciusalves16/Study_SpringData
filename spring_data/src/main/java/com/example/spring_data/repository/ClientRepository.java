package com.example.spring_data.repository;


import com.example.spring_data.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Map;


public interface ClientRepository extends JpaRepository<ClientEntity, Long> {


    @Query(value = "SELECT* FROM cliente WHERE id = ?1", nativeQuery = true)
    ClientEntity buscaDadosCliente(Long aLong);


    //todo:
    /*
    Interface criada para que possa extender uma classe do tipo reposity e que possa utilizar
    todos os métodos da qual esta estendendo, além de poder criar métodos personalizados.

    Como parametro esta sendo passado a classe Model que será a entidade da tabela do banco e também
    o tipo do atributo que corresponde a chava identificadora.
     */
}
