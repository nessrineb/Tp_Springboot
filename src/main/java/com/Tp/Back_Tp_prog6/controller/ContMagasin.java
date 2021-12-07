package com.Tp.Back_Tp_prog6.controller;

import com.Tp.Back_Tp_prog6.model.Magasin;
import com.Tp.Back_Tp_prog6.service.ServMagasin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ContMagasin {

    @Autowired
    ServMagasin Sm;

 @GetMapping("/Magasin")

    private List<Magasin> GetAllMagasins(){


     return Sm.GetAllMagasins();

 }

 @GetMapping("/Magasin/{id}")

    private Magasin GetMagasinById(@PathVariable("id") int id) {

            return Sm.GetMagasinById(id);
 }
@PostMapping("/Magasins")

    private int saveMagasin(@RequestBody Magasin magasin) {

    Sm.SaveOrUpdate(magasin);
    return magasin.getId();

}

@PutMapping("/Magasins")

    private Magasin Update(@RequestBody Magasin magasin){

        Sm.SaveOrUpdate(magasin);
        return magasin;
 }





}
