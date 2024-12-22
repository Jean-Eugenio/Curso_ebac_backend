import teste2.dao.ClienteDao;
import teste2.dao.ClienteDaoMock;
import teste2.dao.IClienteDao;
import teste2.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {


    @Test
    public void salvarTest(){
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = ClassCastException.class)
    public void esperadoErroNoSalvarTest() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService((IClienteDao) mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

}
