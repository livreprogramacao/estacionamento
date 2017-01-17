package br.com.livreprogramacao.resources.marca;

import br.com.livreprogramacao.entity.modelo.Modelo;
import br.com.livreprogramacao.estacionamento.service.EstacionamentoService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author user
 */
@Path("marcas")
public class MarcaResources {
    
    @Inject
    EstacionamentoService service;

    @GET
    public List<Modelo> getModelos() {
        return service.getModelos();
    }

}
