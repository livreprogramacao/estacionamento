package br.com.livreprogramacao.entity.modelo;

import br.com.livreprogramacao.entity.base.EntityBase;
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

    public Modelo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Modelo{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
