package br.com.livreprogramacao.ticket.repository;

import br.com.livreprogramacao.ticket.entity.Ticket;
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
public class TicketRepositoryTest {

    private static final String PU_NAME = "hsqldb";

    @Test
    public void testListAllTickets() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        List<Ticket> tickets = em.createQuery("SELECT t FROM Ticket t").getResultList();
        for (Ticket t : tickets) {
            System.out.println("Ticket: " + t);
        }
        tx.commit();
    }
}
