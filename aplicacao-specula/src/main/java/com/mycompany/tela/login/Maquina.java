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
    private Integer fk_usuario_maquina;
    
     public Maquina() {
     
    }
    
    public Integer getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(Integer id_maquina) {
        this.id_maquina = id_maquina;
    }

    public Integer getFk_usuario_maquina() {
        return fk_usuario_maquina;
    }

    public void setFk_usuario_maquina(Integer fk_usuario_maquina) {
        this.fk_usuario_maquina = fk_usuario_maquina;
    }

    @Override
    public String toString() {
        return "Maquina{" + "id_maquina=" + id_maquina + ", fk_usuario_maquina=" + fk_usuario_maquina + '}';
    }
    
    


    }
  


   