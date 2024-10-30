/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.Practica.service.impl;

import com.practica.Practica.service.ArbolService;
import com.practica.Practica.domain.Arbol;
import com.practica.Practica.dao.ArbolDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author victo
 */
@Service
public class ArbolServiceImpl implements ArbolService{
    
    @Autowired
    private ArbolDao arbolDao;
    @Transactional(readOnly=true)
    public List<Arbol> getArboles(){
        var lista = arbolDao.findAll();
        return lista;
    }
   
    
}
