/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities;

/**
 *
 * @author Alejandro
 */
public enum Alergias {
    
    ANTICONVULSIVOS("ANTICONVULSIVOS"),
    INSULINA("INSULINA"),
    PENICILINA("DESCONOCIDO"),
    SULFAMIDAS("SULFAMIDAS"),
    NINGUNA("NINGUNA");
    
    String alergias;
    
    private Alergias(String alergias) {    
        this.alergias=alergias;
    }
}
