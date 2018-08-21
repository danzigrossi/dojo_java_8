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
public class OrdenaPessoasPorNomeCrescenteTest {

    @InjectMocks
    OrdenaPessoasPorNomeCrescente ordenaPessoasPorNomeCrescente;

    @Test
    public void execute() {
        List<Pessoa> result = ordenaPessoasPorNomeCrescente.execute(CenarioFactory.createCenario());

        Assert.assertEquals(7,result.size() );
        result.forEach(p-> System.out.println(p.getNome()));
        Assert.assertEquals("Carlos", result.get(0).getNome());
        Assert.assertEquals("Eustacio", result.get(1).getNome());
        Assert.assertEquals("Godofredo", result.get(2).getNome());
        Assert.assertEquals("Jose", result.get(3).getNome());
        Assert.assertEquals("João", result.get(4).getNome());
        Assert.assertEquals("Onofre", result.get(5).getNome());
        Assert.assertEquals("Paulo", result.get(6).getNome());
    }
}