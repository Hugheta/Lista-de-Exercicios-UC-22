public class banco {
    private int quantidade;
    private contabancaria[] contas;

    public banco(int tamanhoInicial) {
        this.quantidade = 0;
        this.contas = new contabancaria[tamanhoInicial];
    }

    public boolean adicionar(contabancaria novaConta) {
        if (this.quantidade == this.contas.length) {
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (contas[i] == novaConta) {
                return false;
            }
        }
        this.contas[quantidade] = novaConta;
        this.quantidade++;
        return true;
    }

    public contabancaria recuperar(String agencia, String numero) {
        for (int i = 0; i < quantidade; i++) {
            if (contas[i].getAgencia().equals(agencia) && contas[i].getNumero().equals(numero)) {
                return contas[i];
            }
        }
        return null;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public contabancaria[] getContas() {
        return contas;
    }
}
