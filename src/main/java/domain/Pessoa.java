package domain;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String enderecoRua;
    private List<Conta> contas;

    public Pessoa(String nome, String endereco, List<Conta> contas){
        this.contas = new ArrayList<Conta>(contas);
        this.nome = nome;
        this.enderecoRua = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
