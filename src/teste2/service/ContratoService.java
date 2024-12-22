package teste2.service;

import teste2.dao.IContratoDao;

public class ContratoService implements  IContratoService{

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Usuário encontrado";
    }

    @Override
    public String excluir() {
        return "Excluido com sucesso";
    }

    @Override
    public String atualizar() {
        return "Atualizado com sucesso";
    }
}
