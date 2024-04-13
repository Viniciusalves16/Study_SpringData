package com.example.spring_data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cliente")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "idade")
    private Integer age;

    @JsonIgnore(value = true)
//    @OneToOne(fetch = FetchType.EAGER)


//    @OneToMany
//    @ManyToOne
//    @OneToOne
    @JoinColumn(name = "endereco_id", referencedColumnName = "endereco_id")
    private AddressEntity address;

    public ClientEntity(Client c) {
        this.name = c.name();
        this.age = c.age();
        this.address = (AddressEntity) new AddressEntity(c.address());
    }

//todo:
    /**
     @Entity Indica que essa classe é uma entidade da JPA
     @Table(name = "cliente")nome que foi definido para a tabela no banco de dados
     @Id // Chave primária
     @GeneratedValue(strategy = GenerationType.IDENTITY)// Chave gerada automaticamente
     @Column(name = "name" )// propriedade que representa o nome da tabela do banco de dados
     @OneToOne // tipo do relacionamento entre as tabelas


    /**

     O CascadeType.ALL é uma configuração em JPA (Java Persistence API) que especifica que todas as operações de persistência (CREATE, UPDATE, DELETE)
     feitas na entidade proprietária devem ser propagadas para as entidades associadas. Isso significa que se você fizer uma operação de persistência na
     entidade proprietária, as mesmas operações serão aplicadas às entidades associadas.
     */
}
