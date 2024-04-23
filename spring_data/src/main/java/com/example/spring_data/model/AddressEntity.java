package com.example.spring_data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "endereco")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cep")
    private Integer postalCode;

    @Column(name = "numero")
    private Integer number;

    @Column(name = "bairro")
    private String neighborhood;

    @Column(name = "complemento")
    private String complement;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "client_id")
    private ClientEntity clientEntity;




    public AddressEntity(Address address) {
        this.postalCode = Integer.valueOf(address.postalCode());
        this.number = Integer.valueOf(address.number());
        this.neighborhood = address.neighborhood();
        this.complement = address.complement();


    }
}
