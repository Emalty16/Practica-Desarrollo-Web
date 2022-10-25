/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica01.domain;


import javax.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Entity
@Data
@Table(name="pais")

public class Pais {
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais; //Hibernate lo convierte en id_pais
    String nombre;
    String capital;
    String estado;
    String presidente;
    int poblacion;

    public Pais( String nombre, String capital, String estado, String presidente, int poblacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.estado = estado;
        this.presidente = presidente;
        this.poblacion = poblacion;
    }

    
    
    public Pais() {
    }
}
