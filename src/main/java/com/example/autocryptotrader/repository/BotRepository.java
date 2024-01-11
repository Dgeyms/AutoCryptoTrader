package com.example.autocryptotrader.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BotRepository extends MongoRepository<BotEntity, String> {
    @Override
    <S extends BotEntity> S save(S entity);
}
