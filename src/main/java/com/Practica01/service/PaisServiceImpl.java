/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica01.service;

import com.Practica01.dao.PaisDao;
import com.Practica01.domain.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaisServiceImpl implements PaisService {
    @Autowired
    private PaisDao paisDao;
    
    
    @Override
    @Transactional(readOnly=true)
    public List<Pais> getPaises() {
        var paises = (List<Pais>) paisDao.findAll();
        
        return paises;
    }

    @Override
    @Transactional(readOnly=true)
    public Pais getPais(Pais pais) {
        return paisDao.findById(pais.getIdPais()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Pais pais) {
        paisDao.save(pais);
    }

    @Override
    @Transactional
    public void delete(Pais pais) {
        paisDao.delete(pais);
    }
}
