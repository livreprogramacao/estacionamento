package br.com.livreprogramacao.marca.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class MarcaRepositoryTest {

    @Test
    public void marcaCreateNewResourceTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(new Marca(-1L, "MarcaIndefinida!"));
        tx.commit();
    }

}
