package teste2.service;

import teste2.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;


    public ClienteService(IClienteDao clienteDao){
        //clientDao = new ClientDao();
        //clientDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }


}
