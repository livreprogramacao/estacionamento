package br.com.livreprogramacao.resources.marca;

import br.com.livreprogramacao.entity.marca.Marca;
import br.com.livreprogramacao.estacionamento.service.EstacionamentoService;
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
@Path("marcas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MarcaResources {
    
    @Inject
    EstacionamentoService service;

    @GET
    public List<Marca> getMarcas() {
        return service.getMarcas();
    }

}
