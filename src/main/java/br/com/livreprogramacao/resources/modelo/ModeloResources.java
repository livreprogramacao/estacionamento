package br.com.livreprogramacao.resources.modelo;

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
@Path("modelos")
public class ModeloResources {
    
    @Inject
    EstacionamentoService service;

    @GET
    public List<Modelo> getModelo() {
        return service.getModelos();
    }

}
