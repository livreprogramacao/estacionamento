package br.com.livreprogramacao.estacionamento.marca.resource;

import br.com.livreprogramacao.estacionamento.calculadora.service.EstacionamentoService;
import br.com.livreprogramacao.estacionamento.marca.entity.Marca;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
@Path("marcas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MarcaResource {
    
    @Inject
    EstacionamentoService service;

    @GET
    public List<Marca> getMarcas() {
        return service.getMarcas();
    }

}
