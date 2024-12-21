import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testMulheresList() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Beatriz", "Feminino"));
        pessoas.add(new Pessoa("Jean", "Masculino"));
        pessoas.add(new Pessoa("Julia", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        assertTrue(mulheres.stream().allMatch(pessoa -> pessoa.getSexo().equals("Feminino")));
    }
}