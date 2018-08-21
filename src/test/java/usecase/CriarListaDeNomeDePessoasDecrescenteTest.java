package usecase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CriarListaDeNomeDePessoasDecrescenteTest {

    @InjectMocks
    CriarListaDeNomeDePessoasDecrescente criarListaDeNomeDePessoas;

    @Test
    public void execute() {
        List<String> result = criarListaDeNomeDePessoas.execute(CenarioFactory.createCenario());
        Assert.assertEquals(7,result.size() );
        Assert.assertEquals("Paulo", result.get(0));
        Assert.assertEquals("Onofre", result.get(1));
        Assert.assertEquals("João", result.get(2));
        Assert.assertEquals("Jose", result.get(3));
        Assert.assertEquals("Godofredo", result.get(4));
        Assert.assertEquals("Eustacio", result.get(5));
        Assert.assertEquals("Carlos", result.get(6));

        result.forEach(System.out::println);
    }
}