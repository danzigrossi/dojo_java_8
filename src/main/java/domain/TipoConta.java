package domain;

public enum TipoConta {
    POUPANCA("Poupança"),
    CONTA_CORRENTE("Conta Corrente");


    private String value;

    private TipoConta( String value){
        this.value = value;
    }

}
