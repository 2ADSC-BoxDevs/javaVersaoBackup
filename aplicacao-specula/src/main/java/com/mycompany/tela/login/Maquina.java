/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tela.login;

/**
 *
 * @author kauan.mendes
 */
public class Maquina {
    private Integer id_maquina;

    public Maquina(Integer id_maquina) {
        this.id_maquina = id_maquina;
    }
    
     public Maquina() {
     
    }
    
    
    

    public Integer getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(Integer id_maquina) {
        this.id_maquina = id_maquina;
    }

  
    @Override
    public String toString() {
        return String.format("%d", id_maquina); 
    }


    
    
    
    
}
