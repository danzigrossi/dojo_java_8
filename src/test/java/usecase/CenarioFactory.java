package usecase;

import domain.Agencia;
import domain.Conta;
import domain.Pessoa;
import domain.TipoConta;

import java.util.ArrayList;
import java.util.List;

public class CenarioFactory {
    public static List<Pessoa> createCenario(){

        List<Conta> contas = new ArrayList<Conta>();
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", "Rua a", createContasNegativas()));
        pessoas.add(new Pessoa("Paulo", "Rua b", createContasNegativas()));
        pessoas.add(new Pessoa("Carlos", "Rua c", createContasPositivas()));
        pessoas.add(new Pessoa("Jose", "Avenida a", createContasPositivas()));
        pessoas.add(new Pessoa("Eustacio", "Rua a", createContasNegativas()));
        pessoas.add(new Pessoa("Onofre", "Rua a", createContasNegativas()));
        pessoas.add(new Pessoa("Godofredo", "Avenida b", createContasPositivas()));
        return pessoas;
    }

    public static List<Conta> createContasNegativas(){
        List<Conta> contas = new ArrayList<Conta>();
        Agencia agencia = new Agencia(321, "Americana", "SP");
        contas.add(new Conta("0031265", agencia, -156D, TipoConta.CONTA_CORRENTE));
        contas.add(new Conta("0011274", agencia, -200D, TipoConta.POUPANCA));
        return contas;
    }

    public static List<Conta> createContasPositivas(){
        List<Conta> contas = new ArrayList<Conta>();
        Agencia agencia = new Agencia(123, "Campinas", "SP");
        contas.add(new Conta("00789113", agencia, 200D, TipoConta.CONTA_CORRENTE));
        contas.add(new Conta("00001256", agencia, 1781D, TipoConta.POUPANCA));
        return contas;
    }
}
