package br.com.livreprogramacao.marca.repository;

import br.com.livreprogramacao.marca.entity.Marca;
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

    private static final String DRIVER_CLASS_NAME = "org.hsqldb.jdbcDriver";
    private static final String PERSISTENCE = "META-INF/persistence.xml";
    private static final String PU_NAME = "hsqldb";

    private static EntityManagerFactory emf;
    private static EntityManager em;

    EntityTransaction tx;

    @BeforeClass
    public static void setupClass() {
        System.out.println("Setup class... ");
        emf = Persistence.createEntityManagerFactory(PU_NAME);
        em = emf.createEntityManager();
    }

    @Before
    public void setupMethod() {
        System.out.println("Setup method... ");
        tx = em.getTransaction();
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Class tear down... ");
        em.close();
        emf.close();
    }

    @After
    public void tearDown() {
        System.out.println("Method Tear down... ");
        if (tx.isActive()) {
            tx.rollback();
        }
    }

//    @Test
//    public void checkThereIsPersistenceTest() {
//        assertTrue("Not Found Persistence.xml file", getClass().getResource(PERSISTENCE) != null);
//    }
    
    @Test
    public void checkThereIsDriverClassNameTest() {
        try {
            assertTrue("HSQLDB Class", getClass().forName(DRIVER_CLASS_NAME) != null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MarcaRepositoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*@Test
    public void marcaCreateNewResourceTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(new Marca(100L, "MarcaIndefinida!"));
        tx.commit();
    }*/
    @Test
    public void testListAllMarcas() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();

        tx.begin();
        List<Marca> marcas = em.createQuery("SELECT m FROM Marca m").getResultList();
        for (Marca marca : marcas) {
            System.out.println("Marca: " + marca);
        }
        tx.commit();
    }
}
