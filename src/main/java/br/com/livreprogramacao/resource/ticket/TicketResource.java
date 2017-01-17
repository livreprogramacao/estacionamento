package br.com.livreprogramacao.resource.ticket;

import br.com.livreprogramacao.estacionamento.service.EstacionamentoService;
import br.com.livreprogramacao.ticket.entity.Ticket;
import javax.validation.Valid;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;

/**
 * Implementa as regras de negócios do estacionamento.
 *
 * @author user
 */
@Path("tickets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TicketResource {

    @Inject
    EstacionamentoService service;

    @GET
    public List<Ticket> getTicket() {
        return service.getTickets();
    }

    @POST
    public Ticket add(@Valid Ticket resource) {
        service.add(resource);
        return resource;
    }

    @PUT
    public Ticket update(@Valid Ticket resource) {
        resource = service.update(resource);
        return resource;
    }

    @DELETE
    public void delete(@Valid Ticket resource) {
        service.delete(resource);
    }

}
