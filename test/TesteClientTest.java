import teste2.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

public class TesteClientTest {
    @Test
    public void testeClasseCliente(){
        TesteCliente cliente = new TesteCliente();
        cliente.setNome("Jean");

        Assert.assertEquals("Jean", cliente.getNome());
    }


}