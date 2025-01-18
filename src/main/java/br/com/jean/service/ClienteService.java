/**
 * 
 */
package br.com.jean.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.jean.dao.IClienteDAO;
import br.com.jean.domain.Cliente;
import br.com.jean.exceptions.DAOException;
import br.com.jean.exceptions.MaisDeUmRegistroException;
import br.com.jean.exceptions.TableException;
import br.com.jean.services.generic.GenericService;


@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}