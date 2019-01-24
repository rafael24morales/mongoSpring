package com.mongomonguito.monguito.HuachicolDao;


import com.mongomonguito.monguito.repositories.IHuachocoleroRepository;
import com.mongomonguito.monguito.utileria.Huachicolero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuachicoleroDao {


    @Autowired
    IHuachocoleroRepository iHuachocoleroRepository;


    public boolean huachicoleando(Huachicolero huachicolero) {
        return  iHuachocoleroRepository.save(huachicolero)!=null;
    }

    public List<Huachicolero> traeHuachicoleros() {
        return iHuachocoleroRepository.findAll();
    }
}
