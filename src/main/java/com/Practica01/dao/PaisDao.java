/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Practica01.dao;

import com.Practica01.domain.Pais;
import org.springframework.data.repository.CrudRepository;

public interface PaisDao extends CrudRepository<Pais, Long> {
    
}
