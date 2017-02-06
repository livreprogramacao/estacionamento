package br.com.livreprogramacao.estacionamento.marca.repository;

import br.com.livreprogramacao.estacionamento.marca.entity.Marca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class MarcaRepository {

    @PersistenceContext
    EntityManager em;

    public List<Marca> browse() {
        final String sqlString = "select * from Marca m";
        return em.createQuery(sqlString).getResultList();
    }

    public void create(final Marca marca) {
        em.persist(marca);
        em.flush();
    }

    public void update(final Marca marca) {
        em.persist(marca);
        em.flush();
    }

    public void delete(final Long marcaId) {
        Marca marca = findById(marcaId);
        if (marca != null) {
            em.remove(marca);
            em.flush();
        }
    }

    private Marca findById(final Long marcaId) {
        return em.find(Marca.class, marcaId);
    }
}
