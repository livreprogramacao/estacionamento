package br.com.livreprogramacao.modelo.repository;

import br.com.livreprogramacao.modelo.entity.Modelo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author user
 */
public class ModeloRepositoryTest {

    private static final String PU_NAME = "hsqldb";

    @Test
    public void testListAllModelos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        List<Modelo> modelos = em.createQuery("SELECT m FROM Modelo m").getResultList();
        for (Modelo m : modelos) {
            System.out.println("Modelo: " + m);
        }
        tx.commit();
    }
}
