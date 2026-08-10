public class pessoa {
    private long id;
    private String nome;

    public pessoa(String nome) {
        this.nome = nome;
        this.id = System.currentTimeMillis();
    }

    public pessoa() {
        this.id = System.currentTimeMillis();
    }

    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }
}
