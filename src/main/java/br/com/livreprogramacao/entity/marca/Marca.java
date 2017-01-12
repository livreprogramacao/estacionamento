package br.com.livreprogramacao.entity.marca;

import br.com.livreprogramacao.entity.base.EntityBase;

/**
 *
 * @author user
 */
public class Marca extends EntityBase {

    private String nome;

    public Marca() {
    }

    public Marca(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Marca{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
