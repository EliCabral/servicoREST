/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdsoft.service.resource;

import br.com.tdsoft.model.Repositorio;
import br.com.tdsoft.model.RepositorioSimplificado;
import br.com.tdsoft.repository.RepositorioRepository;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Elivelton Cabral
 */
@Path("/repos")
public class RepositorioResource {

    @Context
    private UriInfo context;

    @Inject
    private RepositorioRepository serviceRepositorio;

    public RepositorioResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/find")
    public Response getRepositorios(
            @QueryParam("nome") String nome,
            @QueryParam("pagina") Integer pagina,
            @QueryParam("por_pagina") Integer porPagina) {

        if (nome == null || nome.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("{\"mensagem\":\"Nome é obrigatório\"}")
                    .build();
        }

        if (pagina == null || pagina < 1) {
            pagina = 1;
        }

        if (porPagina == null || porPagina < 1) {
            porPagina = 1;
        } else if (porPagina > 25) {
            porPagina = 25;
        }

        List<RepositorioSimplificado> listaRepositorios = serviceRepositorio.buscaPaginada(nome, pagina, porPagina);

        if (listaRepositorios != null && !listaRepositorios.isEmpty()) {
            return Response.ok(listaRepositorios).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"mensagem\":\"Nenhum registro encontrado\"}")
                    .build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{repoId}")
    public Response getRepositorio(@PathParam(value = "repoId") String repoId) {
        Repositorio repositorio = (Repositorio) serviceRepositorio.findById(repoId);

        if (repositorio != null) {
            return Response.ok(repositorio).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"mensagem\":\"Nenhum registro encontrado\"}")
                    .build();
        }
    }

}
