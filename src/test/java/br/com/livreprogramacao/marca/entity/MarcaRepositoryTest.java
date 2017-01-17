package br.com.livreprogramacao.marca.entity;

import br.com.livreprogramacao.entity.marca.Marca;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author user
 */
public class MarcaRepositoryTest {
    
    @Test
    public void mappingSmokeTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(new Marca(-1L, "MarcaIndefinida!"));
        tx.commit();
    }
 
}
