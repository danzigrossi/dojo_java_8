package usecase;

import domain.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AchaPessoasPorRua {

    public List<Pessoa> execute(List<Pessoa> pessoas, String nomeRua) {
        List<Pessoa> result = null;
        Predicate<Pessoa> comparaNomeRua = p-> p.getEnderecoRua().equals(nomeRua);
        result = pessoas.stream().filter( comparaNomeRua).collect(Collectors.toList());
        return result;
    }
}
