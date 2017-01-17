package br.com.livreprogramacao.marca.entity;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class MarcaRepositoryTest {
    
    private static final String DRIVER_CLASS_NAME = "org.hsqldb.jdbcDriver";
    private static final String PERSISTENCE = "persistence.xml";
    private static final String PU_NAME = "hsqldb";
    
    
    @Test
    public void checkThereIsPersistenceTest() {
        assertTrue("Not Found src/test/resources/META-INF/persistence.xml file", getClass().getResource(PERSISTENCE) != null);
    }
    
    @Test
    public void checkThereIsDriverClassNameTest() {
        try {
            assertTrue("HSQLDB Class", getClass().forName(DRIVER_CLASS_NAME) != null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MarcaRepositoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void marcaCreateNewResourceTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(new Marca(-1L, "MarcaIndefinida!"));
        tx.commit();
    }

}