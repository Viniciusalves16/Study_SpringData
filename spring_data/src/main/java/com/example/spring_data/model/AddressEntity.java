package com.example.spring_data.model;

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
    @Column(name = "endereco_id")
    private Long addressId;

    @Column(name = "cep")
    private Integer postalCode;

    @Column(name = "numero")
    private Integer number;

    @Column(name = "bairro")
    private String neighborhood;

    @Column(name = "complemento")
    private String complement;


    public AddressEntity(Address address) {
        this.postalCode = Integer.valueOf(address.postalCode());
        this.number = Integer.valueOf(address.number());
        this.neighborhood = address.neighborhood();
        this.complement = address.complement();


    }
}
