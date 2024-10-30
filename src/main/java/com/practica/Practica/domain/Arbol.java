/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.Practica.domain;

/**
 *
 * @author victo
 */
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data
@Entity
@Table(name="Arbol")
public class Arbol implements Serializable{
     private static final long serialVersionUID = 1L;
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id_arbol")
    private Long idArbol;
    private String nombre_comun;
    private String tipo_flor;
    private String dureza_madera;
    private int altura_promedio;
    private String ruta_imagen;
    
    public Arbol(){
        
    }
    public Arbol(String nombre)
    {
        this.nombre_comun = nombre;
      
    }    
}

