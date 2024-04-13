/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdsoft.repository;

import br.com.tdsoft.model.Repositorio;
import br.com.tdsoft.model.RepositorioSimplificado;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Elivelton Cabral
 */

//Classe EJB sem estado
@Stateless
public class RepositorioRepository extends AbstractRepository<Repositorio> {

    private static final long serialVersionUID = 1L;

    //chama o construtor da classe pai passando como argumento a classe repositorio
    public RepositorioRepository() {
        super(Repositorio.class);
    }
    

    //Método que retorna uma lista paginada de objetos de RepositorioSimplificado
    public List<RepositorioSimplificado> buscaPaginada(String nome, int pagina, int porPagina) {
        List<RepositorioSimplificado> repositorio = new ArrayList<RepositorioSimplificado>();
        String sql = "SELECT NEW br.com.tdsoft.model.RepositorioSimplificado(r.id, r.nameWithOwner) FROM repositories r WHERE LOWER(r.nameWithOwner) LIKE LOWER(:nome)";

        repositorio = getEm().createQuery(sql)
                .setParameter("nome", "%" + nome.toLowerCase() + "%")
                .setFirstResult((pagina - 1) * porPagina)
                .setMaxResults(porPagina)
                .getResultList();
        return repositorio.isEmpty() ? null : repositorio;
    }

    public Repositorio findById(Object repoId) {
        String jpql = "SELECT r FROM repositories r JOIN FETCH r.owner WHERE LOWER(r.id) = LOWER(:repoId)";
        Query query = getEm().createQuery(jpql).setParameter("repoId", repoId);
        
        try {
            return (Repositorio) query.getSingleResult();
        } catch (NoResultException e) {
            // nenhum resultado encontrado
            return null;
        }
    }
}