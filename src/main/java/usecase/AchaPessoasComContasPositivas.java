package usecase;

import domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class AchaPessoasComContasPositivas {
    public List<Pessoa> execute(List<Pessoa> pessoas){
        List<Pessoa> result = pessoas
                .stream()
                .filter( p -> p.getContas()
                        .stream()
                        .filter( c -> c.getSaldo() > 0)
                        .count() > 0)
                .collect(Collectors.toList());

        return result;
    }

}
