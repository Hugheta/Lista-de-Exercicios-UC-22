public class contabancaria {
    private String agencia;
    private Float saldo;
    private pessoa titular;

    public contabancaria() {
        
    }
    public contabancaria(String agencia, Float saldo, pessoa titular) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Nome do Titular: " + titular + " Saldo Bancário: R$" + saldo;
    }

    public boolean sacar(Float valor) {
        if (saldo <= valor) {
        saldo = saldo - valor;
        return true;
        }
        else {
            return false;
        }
        
    }
    public boolean depositar(Float valor) {
        if (valor < 0){
        saldo = saldo + valor;
        return true;}
        else {
            return false;
        }
    }
    
}
