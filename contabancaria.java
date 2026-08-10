public class contabancaria {
    private float saldo;
    private String agencia;
    private String numero;
    private pessoa titular;

    public contabancaria() {
    }

    public contabancaria(float saldo, String agencia, String numero, pessoa titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Titular: " + (titular != null ? titular.getNome() : "Sem titular") + " | Saldo Atual: R$" + saldo;
    }

    public boolean sacar(float valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public pessoa getTitular() {
        return titular;
    }
}
