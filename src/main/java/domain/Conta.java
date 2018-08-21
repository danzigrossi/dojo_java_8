package domain;

public class Conta {
    private String numero;
    private Agencia agencia;
    private Double saldo;
    private TipoConta tipoConta;

    public Conta(String numero, Agencia agencia, Double saldo, TipoConta tipoConta) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
}
