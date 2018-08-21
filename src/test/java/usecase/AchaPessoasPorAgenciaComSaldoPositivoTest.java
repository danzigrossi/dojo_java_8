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
public class AchaPessoasPorAgenciaComSaldoPositivoTest {

    @InjectMocks
    AchaPessoasPorAgenciaComSaldoPositivo achaPessoasPorAgenciaComSaldoPositivo;

    @Test
    public void execute() {
        List<Pessoa> pessoasComSaldoPositivo = achaPessoasPorAgenciaComSaldoPositivo.execute(CenarioFactory.createCenario(),123);
        Assert.assertEquals(3,pessoasComSaldoPositivo.size() );
        Assert.assertEquals(1, pessoasComSaldoPositivo.stream().filter(a -> a.getNome().equals("Carlos") ).count() );
        Assert.assertEquals(1, pessoasComSaldoPositivo.stream().filter(a -> a.getNome().equals("Jose") ).count() );
        Assert.assertEquals(1, pessoasComSaldoPositivo.stream().filter(a -> a.getNome().equals("Godofredo") ).count() );

    }
}