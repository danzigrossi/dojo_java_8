package usecase;

import domain.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AchaPessoasPorRuaComContaNegativaOrdenadaPorNomeCrescenteTest {

    @InjectMocks
    AchaPessoasPorRuaComContaNegativaOrdenadaPorNomeCrescente achaPessoasPorRuaComContaNegativaOrdenadaPorNomeCrescente;

    @Test
    public void execute() {
        List<Pessoa> result = achaPessoasPorRuaComContaNegativaOrdenadaPorNomeCrescente.execute(CenarioFactory.createCenario(), "Rua a");
        Assert.assertEquals(3,result.size() );
        Assert.assertEquals("Eustacio", result.get(0).getNome());
        Assert.assertEquals("João", result.get(1).getNome());
        Assert.assertEquals("Onofre", result.get(2).getNome());

    }
}