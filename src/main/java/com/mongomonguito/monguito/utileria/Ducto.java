package com.mongomonguito.monguito.utileria;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ducto {

    @Id
    private int id;

    private String ubicacion;

}
