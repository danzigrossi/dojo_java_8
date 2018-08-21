package usecase;

import domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AchaPessoasPorAgenciaComSaldoPositivo {

    public List<Pessoa> execute(List<Pessoa> pessoas, Integer numeroAgencia) {
        return pessoas;

    }
}
