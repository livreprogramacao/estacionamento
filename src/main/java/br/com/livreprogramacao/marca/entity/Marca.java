package br.com.livreprogramacao.marca.entity;

import br.com.livreprogramacao.base.entity.EntityBase;
import javax.persistence.Entity;

/**
 *
 * @author user
 */
@Entity
public class Marca extends EntityBase {

    private String nome;

    public Marca() {
    }

    public Marca(final Long _id, final String nome) {
        super(_id);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Marca{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

}
