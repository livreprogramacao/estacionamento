package br.com.livreprogramacao.resource.calculadora;

import br.com.livreprogramacao.calculadora.CalculadoraMarcaEstacionamento;
import br.com.livreprogramacao.calculadora.CalculadoraMarcaModeloEstacionamento;
import br.com.livreprogramacao.calculadora.CalculadoraOutrosEstacionamento;
import br.com.livreprogramacao.calculadora.CalculadoraPlacaB99Estacionamento;
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
    
    private Integer valor;
    
    @GET
    public Integer valor() {
        return valor; // demais marcas e modelos o valor é 5;
    }
    
    @POST
    public void calcularValor(Ticket ticket) {
        executarCalculadora(ticket);
    }

    private void executarCalculadora(@Valid Ticket ticket) {
        Integer valor1 = new CalculadoraMarcaEstacionamento().resultado(ticket);
        Integer valor2 = new CalculadoraMarcaModeloEstacionamento().resultado(ticket);
        Integer valor3 = new CalculadoraPlacaB99Estacionamento().resultado(ticket);
        Integer valor4 = new CalculadoraOutrosEstacionamento().resultado(ticket);
        valor = valor1+valor2+valor3+valor4;
        System.out.format("Debug -- valor cobrado R$ %s para o Ticket %s", valor, ticket);
    }

}
