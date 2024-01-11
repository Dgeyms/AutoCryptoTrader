package com.example.autocryptotrader.repository;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tokens")
public class Token {
    @Id
    private ObjectId id;
    private String nameToken;

    public String getNameToken() {
        return nameToken;
    }

    public void setNameToken(String nameToken) {
        this.nameToken = nameToken;
    }
}
