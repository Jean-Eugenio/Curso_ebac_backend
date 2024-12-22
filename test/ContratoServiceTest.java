import teste2.dao.ContratoDao;
import teste2.dao.IContratoDao;
import teste2.dao.mock.ContratoDaoMock;
import teste2.service.ContratoService;
import teste2.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {


    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTeste(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Usuário encontrado", retorno);
    }

    @Test
    public void excluirTeste(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido com sucesso", retorno);
    }


    @Test
    public void atualizarTeste(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado com sucesso", retorno);
    }

}