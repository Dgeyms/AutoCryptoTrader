package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.ClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@Controller
@RestController("/client")
public class ClientController {

    @PostMapping("/client/createClient")
    public ResponseEntity<String> createClient(@Validated @RequestBody ClientDTO clientDTO){



    }
}
