package com.example.spring_data.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Client(@NotBlank String name,@NotNull Integer age,Address address) {
}
