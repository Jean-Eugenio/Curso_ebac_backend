package services;

import Exceptions.DAOException;
import br.domain.Cliente;
import services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;

}