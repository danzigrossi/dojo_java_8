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
public class AchaPessoasPorRuaTest {
    @InjectMocks
    AchaPessoasPorRua achaPessoasPorRua;

    @Test
    public void execute() {
        List<Pessoa> result = achaPessoasPorRua.execute(CenarioFactory.createCenario(), "Rua a");
        Assert.assertEquals(3,result.size() );
    }
}