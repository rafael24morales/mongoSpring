package com.mongomonguito.monguito.utileria;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Huachicolero {

    @Id
    private int id;


    private String nombre;

    private String rfc;

    private Gasolinera gasolinera;
    private List<Ducto> ducto;

}
