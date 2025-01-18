/**
 * 
 */
package br.com.jean.dao;

import br.com.jean.dao.generic.GenericDAO;
import br.com.jean.domain.Cliente;


public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}