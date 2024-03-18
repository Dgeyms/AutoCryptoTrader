package com.example.autocryptotrader.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ClientDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_client")
    private String nameClient;

    @Column(name = "email_client")
    private String emailClient;

    @Column(name = "password_client")
    private String passwordClient;
}
