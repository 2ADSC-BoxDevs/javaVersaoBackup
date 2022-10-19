/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tela.login;

/**
 *
 * @author kauan.mendes
 */
public class UsuarioMaquina {
    
    private String nome_usuario_maquina;
    private String identificacao_usuario;

    public UsuarioMaquina(String nome_usuario_maquina, String identificacao_usuario) {
        this.nome_usuario_maquina = nome_usuario_maquina;
        this.identificacao_usuario = identificacao_usuario;
    }
    
        public UsuarioMaquina() {
      
    }

    public String getNome_usuario_maquina() {
        return nome_usuario_maquina;
    }

    public void setNome_usuario_maquina(String nome_usuario_maquina) {
        this.nome_usuario_maquina = nome_usuario_maquina;
    }

    public String getIdentificacao_usuario() {
        return identificacao_usuario;
    }

    public void setIdentificacao_usuario(String identificacao_usuario) {
        this.identificacao_usuario = identificacao_usuario;
    }

    @Override
    public String toString() {
        return "UsuarioMaquina{" + "nome_usuario_maquina=" + nome_usuario_maquina + ", identificacao_usuario=" + identificacao_usuario + '}';
    }
    
    
    
    
}
