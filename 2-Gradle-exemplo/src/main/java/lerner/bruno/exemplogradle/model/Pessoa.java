package lerner.bruno.exemplogradle.model;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 14/04/2020 11:07
 */
public class Pessoa {

    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
