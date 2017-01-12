package br.com.livreprogramacao.resource.calculadora;

import br.com.livreprogramacao.entity.ticket.Ticket;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Calcula o valor do estacionamento.
 * 
 * @author user
 */
@Path("calculadora")
public class CalculadoraTarifa {
    
    @GET
    public String valor() {
        return "5"; // demais marcas e modelos o valor é 5;
    }
    
    @POST
    public void calcularValor(Ticket ticket) {
        
    }

}
