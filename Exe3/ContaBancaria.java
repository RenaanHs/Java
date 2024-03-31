class ContaBancaria {
    private int numeroConta;
    private String titular;
    private float saldo;

    ContaBancaria(int numeroConta, String titular, float saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    void setTitular(String titular) {
        this.titular = titular;
    }

    void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    int getNumeroConta() {
        return this.numeroConta;
    }

    String getTitular() {
        return this.titular;
    }

    float getSaldo() {
        return this.saldo;
    }

    void deposito(float valor) {
        this.saldo += valor;
    }

    void saque(float valor) {
        this.saldo -= valor;
    }
}