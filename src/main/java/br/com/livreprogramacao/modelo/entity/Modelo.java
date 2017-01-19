package br.com.livreprogramacao.modelo.entity;

import br.com.livreprogramacao.jee.jpa.entity.EntityBase;
import br.com.livreprogramacao.marca.entity.Marca;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
@Entity
public class Modelo extends EntityBase {

    @NotNull(message = "Por gentileza, informe a Marca!")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Marca marca;

    @Basic
    private String nome;

    public Modelo() {
    }

    public Modelo(final Long _id, final Marca _marca, final String nome) {
        super(_id);
        this.marca = _marca;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Modelo{" + " marca=" + marca + ", nome=" + nome + '}';
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(final Marca marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

}
