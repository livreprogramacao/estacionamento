package br.com.livreprogramacao.resources.modelo;

import br.com.livreprogramacao.estacionamento.service.EstacionamentoService;
import br.com.livreprogramacao.modelo.entity.Modelo;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author user
 */
@Path("modelos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ModeloResources {
    
    @Inject
    EstacionamentoService service;

    @GET
    public List<Modelo> getModelo() {
        return service.getModelos();
    }

}
