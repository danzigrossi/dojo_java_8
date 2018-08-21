package usecase;

import domain.Conta;
import domain.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaPessoasPorSaldoTotal {

    private static int compare(Pessoa p1, Pessoa p2) {
        Double saldo1 = p1.getContas().stream().map(Conta::getSaldo).reduce(0.0, (a, b) -> a + b);
        Double saldo2 = p2.getContas().stream().map(Conta::getSaldo).reduce(0.0, (a, b) -> a + b);

        return saldo1.compareTo(saldo2);
    }

    public List<Pessoa> execute(List<Pessoa> pessoas) {
        List<Pessoa> result = null;
        Comparator<Pessoa> comparaSaldo = OrdenaPessoasPorSaldoTotal::compare;
        pessoas.sort(comparaSaldo);
        return pessoas;
    }

}
