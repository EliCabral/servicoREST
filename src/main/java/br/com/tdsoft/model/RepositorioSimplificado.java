/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdsoft.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Elivelton Cabral
 */

//DTO que filtra o id e nome para usar na busca paginada
public class RepositorioSimplificado {
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String name;

    public RepositorioSimplificado(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}
