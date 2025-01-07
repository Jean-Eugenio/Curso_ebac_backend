package br.dao.generic;



import java.io.Serializable;
import java.util.Collection;

import Exceptions.DAOException;
import Exceptions.MaisDeUmRegistroException;
import Exceptions.TableException;
import Exceptions.TipoChaveNaoEncontradaException;
import br.dao.Persistente;


public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(E valor) throws DAOException;

    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}