package com.mongomonguito.monguito.controladores;


import com.mongomonguito.monguito.HuachicolDao.HuachicoleroDao;
import com.mongomonguito.monguito.utileria.Huachicolero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HuachicoleroController {

    @Autowired
    HuachicoleroDao huachicoleroDao;

    @PostMapping("/huachicolero")
    public boolean postHuachicol(@RequestBody Huachicolero huachicolero){
        return huachicoleroDao.huachicoleando(huachicolero);
    }

    @GetMapping("/huachicolero")
    public List<Huachicolero> getHuachicoleros(){
        return huachicoleroDao.traeHuachicoleros();
    }


}
