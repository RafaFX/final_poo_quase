package br.univille.poo.app.servico;

import br.univille.poo.app.persistencia.ListaDAO;

import java.awt.*;
import java.util.ArrayList;

public class CriarLista {



    private ListaDAO dao;

    public CriarLista(){
        dao = new ListaDAO();
    }

    public void criar(String listaName) throws Exception {
        dao.inserir(listaName);

    }

}
