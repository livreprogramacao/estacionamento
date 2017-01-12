package br.com.livreprogramacao.calculadora;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/**
 * Calcula o valor do estacionamento.
 * 
 * @author user
 */
@Path("calculadora")
public class CalculadoraTarifa {
    
    @GET
    public String total() {
        return "10";
    }
    
    @PUT
    public void calcularValor() {
        
    }

}
