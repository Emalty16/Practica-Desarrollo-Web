/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Practica01.service;

import com.Practica01.domain.Pais;
import java.util.List;

public interface PaisService {

    public List<Pais> getPaises();

    public Pais getPais(Pais pais);

    public void save(Pais pais);

    public void delete(Pais pais);
}
