public class banco {
    private int quantidade;
    private contabancaria[]contas;

    public banco(int tamanhoinicial){
        this.quantidade = 0;
        this.contas = new contabancaria[tamanhoinicial];
        
    }

    public boolean adicionar(contabancaria novaconta) {
        if (this.quantidade == this.contas.length){
            return false;
        }
        for (int i = 0; i < quantidade; i++ ){
            if (contas[i] == novaconta)
            return false;
        }
        this.contas[quantidade] = novaconta;
        this.quantidade++;
        return true;
    }

    public void recuperar() {
        
    }
    

}

