public class pessoa {
    private Long id;
    private String nome;


public pessoa(String nome, Long id) {
this.nome = nome;
this.id = System.currentTimeMillis();
};

public pessoa (){

id = System.currentTimeMillis();
}

}