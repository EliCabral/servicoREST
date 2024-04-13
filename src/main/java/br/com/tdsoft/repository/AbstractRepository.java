/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdsoft.repository;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Elivelton Cabral
 */
public abstract class AbstractRepository<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    @Produces
    protected EntityManager em;

    private Class<T> entityClass;

    public AbstractRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected EntityManager getEm() {
        return em;
    }


}
