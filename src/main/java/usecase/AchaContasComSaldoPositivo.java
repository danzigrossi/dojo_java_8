package usecase;

import domain.Conta;
import domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AchaContasComSaldoPositivo {

    public List<Conta> execute(List<Conta> contas) {
        List<Conta> result = contas
                .stream()
                .filter( c -> c.getSaldo() > 0 )
                .collect(Collectors.toList());

        return result;
    }
}
