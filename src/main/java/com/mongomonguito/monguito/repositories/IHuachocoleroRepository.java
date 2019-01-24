package com.mongomonguito.monguito.repositories;

import com.mongomonguito.monguito.utileria.Huachicolero;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IHuachocoleroRepository extends MongoRepository<Huachicolero, Integer> {
}
