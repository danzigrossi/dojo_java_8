package usecase;

import domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class AchaPessoasPorRuaComContaNegativaOrdenadaPorNomeCrescente {
    public List<Pessoa> execute(List<Pessoa> pessoas, String nomeRua) {
        List<Pessoa> result = null;
        return result;
    }
}
