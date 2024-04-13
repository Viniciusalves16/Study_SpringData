package com.example.spring_data.model;

import jakarta.validation.constraints.NotBlank;

public record Address(@NotBlank String postalCode, @NotBlank String number, @NotBlank String neighborhood,@NotBlank String complement) {
}
