package br.com.livreprogramacao.resource.calculadora;

import br.com.livreprogramacao.calculadora.CalculadoraEstacionamento;
import br.com.livreprogramacao.calculadora.CalculadoraMarcaEstacionamento;
import br.com.livreprogramacao.entity.ticket.Ticket;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Calcula o valor do estacionamento.
 * 
 * @author user
 */
@Path("calculadora")
public class CalculadoraRest {
    
    private String valor;
    
    @GET
    public String valor() {
        return valor; // demais marcas e modelos o valor é 5;
    }
    
    @POST
    public void calcularValor(Ticket ticket) {
        valor = executarCalculadora(ticket);
    }

    private String executarCalculadora(@Valid Ticket ticket) {
        System.out.format("Debug -- %s", ticket);
        CalculadoraEstacionamento calculadora = new CalculadoraMarcaEstacionamento();
        return calculadora.resultado(ticket)+"";
    }

}
