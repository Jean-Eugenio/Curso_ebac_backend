package services;

import Exceptions.DAOException;
import Exceptions.MaisDeUmRegistroException;
import Exceptions.TableException;
import br.dao.IClienteDAO;
import br.domain.Cliente;
import services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {


    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }


    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            e.printStackTrace();
        }
        return null;
    }
}