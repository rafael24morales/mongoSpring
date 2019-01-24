package com.mongomonguito.monguito.repositories;

import com.mongomonguito.monguito.utileria.Ducto;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.ObjectInput;

public interface IDuctoRepository extends MongoRepository<Ducto,ObjectId> {

}
