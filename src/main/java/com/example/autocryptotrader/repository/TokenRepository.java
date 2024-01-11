package com.example.autocryptotrader.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TokenRepository extends MongoRepository<Token, ObjectId> {
    List<Token> addTokenInDatabase(String nameToken);

}
