package usecase;

import domain.Pessoa;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CriarListaDeNomeDePessoasDecrescente {
    public List<String> execute(List<Pessoa> pessoas) {
        List<String> result = null;
        return result;
    }
}
