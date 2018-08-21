package usecase;

import domain.Conta;
import domain.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AchaContasComSaldoPositivoTest {

    @InjectMocks
    private AchaContasComSaldoPositivo achaContasComSaldoPositivo;

    @Test
    public void execute() {
        List<Conta> contas = new ArrayList<>(CenarioFactory.createContasNegativas());
        contas.addAll(CenarioFactory.createContasPositivas());
        contas.addAll(CenarioFactory.createContasNegativas());
        List<Conta> pessoasComSaldoPositivo = achaContasComSaldoPositivo.execute(contas);
        Assert.assertEquals(2, pessoasComSaldoPositivo.size() );

    }
}