/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.Practica.dao;

import com.practica.Practica.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author victo
 */
public interface ArbolDao extends JpaRepository <Arbol,Long>{
    
    
}
