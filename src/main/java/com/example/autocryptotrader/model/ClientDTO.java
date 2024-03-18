package com.example.autocryptotrader.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class ClientDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, message = "Name must be at least 3 characters long")
    @Column(name = "name_client")
    private String nameClient;

    @Email
    @Column(name = "email_client")
    private String emailClient;

    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Password must contain only letters and digits")
    @Size(min = 5, message = "Password must be at least 5 characters long")
    @Column(name = "password_client")
    private String passwordClient;
}
