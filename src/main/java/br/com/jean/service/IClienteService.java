/**
 * 
 */
package br.com.jean.service;

import br.com.jean.domain.Cliente;
import br.com.jean.exceptions.DAOException;
import br.com.jean.services.generic.IGenericService;

/**
 * @author Vinícius Pelizzari
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}