package usecase;

import domain.Agencia;
import domain.Conta;
import domain.Pessoa;
import domain.TipoConta;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AchaPessoasComContasPositivasTest {

    @InjectMocks
    AchaPessoasComContasPositivas achaContasPositivas;

    @Test
    public void testExecute() {

        List<Pessoa> pessoasComSaldoPositivo = achaContasPositivas.execute(CenarioFactory.createCenario());
        Assert.assertEquals(3,pessoasComSaldoPositivo.size() );
        Assert.assertEquals(1, pessoasComSaldoPositivo.stream().filter(a -> a.getNome().equals("Carlos") ).count() );
        Assert.assertEquals(1, pessoasComSaldoPositivo.stream().filter(a -> a.getNome().equals("Jose") ).count() );
        Assert.assertEquals(1, pessoasComSaldoPositivo.stream().filter(a -> a.getNome().equals("Godofredo") ).count() );

    }



}
