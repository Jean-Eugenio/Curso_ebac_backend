import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTests {

    @Test
    public void primeiroTeste(){
        String nome = "Jean";
        Assert.assertEquals("Jean", nome);
    }

    @Test
    public void testNotEquals(){
        String nome = "Jean";
        Assert.assertNotEquals("Jeann", nome);
    }

}