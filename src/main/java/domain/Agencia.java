package domain;

public class Agencia {
    private Integer numero;
    private String cidade;
    private String uf;

    public Agencia(Integer numero, String cidade, String uf) {
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
