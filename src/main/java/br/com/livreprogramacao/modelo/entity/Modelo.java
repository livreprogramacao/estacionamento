package br.com.livreprogramacao.modelo.entity;

import br.com.livreprogramacao.base.entity.EntityBase;
import javax.persistence.Entity;

/**
 *
 * @author user
 */
@Entity
public class Modelo extends EntityBase {

    private String nome;

    public Modelo() {
    }

    public Modelo(final Long _id, final String nome) {
        super(_id);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Modelo{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

}
