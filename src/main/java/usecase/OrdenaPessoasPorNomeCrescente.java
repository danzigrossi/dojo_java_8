package usecase;

import domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrdenaPessoasPorNomeCrescente {

    public List<Pessoa> execute(List<Pessoa> pessoas) {
        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        return pessoas;
    }

}
