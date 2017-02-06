package br.com.livreprogramacao.marca.repository;

import br.com.livreprogramacao.estacionamento.marca.entity.Marca;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class MarcaRepositoryTest {

    protected static final String DRIVER_CLASS_NAME = "org.hsqldb.jdbcDriver";
    protected static final String PU_NAME = "hsqldb";

    protected static EntityManagerFactory emf;
    protected static EntityManager em;

    protected EntityTransaction tx;

    @BeforeClass
    public static void setupClass() {
        System.out.println("Setup class... ");
        emf = Persistence.createEntityManagerFactory(PU_NAME);
        em = emf.createEntityManager();
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Class tear down... ");
        em.close();
        emf.close();
    }

    @Test
    public void checkThereIsDriverClassNameTest() {
        try {
            assertTrue("HSQLDB Class", getClass().forName(DRIVER_CLASS_NAME) != null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MarcaRepositoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Before
    public void setupMethod() {
        System.out.println("Setup method... ");
        tx = em.getTransaction();
    }

    @After
    public void tearDown() {
        System.out.println("Method Tear down... ");
        if (tx.isActive()) {
            tx.rollback();
        }
    }

    @Test
    public void marcaCreateNewResourceTest() {
        tx.begin();
        em.persist(new Marca(100L, "MarcaIndefinida!"));
        tx.commit();
    }

    @Test
    public void testListAllMarcas() {

        tx.begin();
        List<Marca> l = em.createQuery("SELECT m FROM Marca m").getResultList();
        l.forEach(System.out::println);
        tx.commit();

    }
}
