package br.com.livreprogramacao.estacionamento.ticket.resource;

import br.com.livreprogramacao.estacionamento.calculadora.service.EstacionamentoService;
import br.com.livreprogramacao.estacionamento.ticket.entity.Ticket;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Implementa as regras de negócios do estacionamento.
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
@Path("tickets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TicketResource {

    @Inject
    EstacionamentoService service;

    @GET
    public List<Ticket> get() {
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
