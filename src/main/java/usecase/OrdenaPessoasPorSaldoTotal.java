package usecase;

import domain.Conta;
import domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@Service
public class OrdenaPessoasPorSaldoTotal {


    public List<Pessoa> execute(List<Pessoa> pessoas) {

        return pessoas;
    }

}
