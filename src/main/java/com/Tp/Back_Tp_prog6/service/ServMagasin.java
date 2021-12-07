package com.Tp.Back_Tp_prog6.service;

import com.Tp.Back_Tp_prog6.model.Magasin;
import com.Tp.Back_Tp_prog6.repository.RepMagasin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServMagasin {

    @Autowired
    RepMagasin Rm;


    public List<Magasin> GetAllMagasins(){
        List<Magasin> Magasins = new ArrayList<>();
        Rm.findAll().forEach(magasin -> Magasins.add(magasin));
                return Magasins;
    }

    public Magasin GetMagasinById(int id){

        return Rm.findById(id).get();
    }

    public void SaveOrUpdate(Magasin magasin){

            Rm.save(magasin);
    }
    public void DeleteMagasinById(int id){

        Rm.deleteById(id);
    }
}
