/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

import java.awt.Color;

/**
 *
 * @author aluno
 */
public class Categoria {

    private int id = 0;
    private String descricao = "";
    private String cor = "";

    public Categoria() {};
    public Categoria(String descricao, String cor) {
        this.descricao = descricao;
        this.cor = cor;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }
    //
    public void setCor(String cor) {
        this.cor = cor;
    }

}
