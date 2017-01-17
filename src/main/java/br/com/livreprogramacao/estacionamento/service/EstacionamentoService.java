package br.com.livreprogramacao.estacionamento.service;

import br.com.livreprogramacao.entity.marca.Marca;
import br.com.livreprogramacao.entity.modelo.Modelo;
import br.com.livreprogramacao.entity.ticket.Ticket;
import java.util.ArrayList;
import java.util.List;

public class EstacionamentoService {

    private final List<Marca> marcaCollection = new ArrayList<>(10);
    private final List<Modelo> modeloCollection = new ArrayList<>(10);
    private final List<Ticket> ticketCollection = new ArrayList<>(10);

    public EstacionamentoService() {

        Long marcaId = 1L;
        String nomeMarca = "Chevrolet";
        Marca chevrolet = new Marca(marcaId, nomeMarca);
        marcaCollection.add(chevrolet);

        Long modeloId = 1L;
        String nomeModelo = "Blazer";
        Modelo blazer = new Modelo(modeloId, nomeModelo);
        modeloCollection.add(blazer);

        Long ticketId = 1L;
        String placa = "HJK-7858";
        Ticket ticketBlazer = new Ticket(ticketId, chevrolet, blazer, placa);
        ticketCollection.add(ticketBlazer);
    }

    public List<Marca> getMarcas() {
        return marcaCollection;
    }

    public List<Modelo> getModelos() {
        return modeloCollection;
    }

    public List<Ticket> getTickets() {
        System.out.println("Ticket - Get all resources!");
        return ticketCollection;
    }

    public void add(Ticket resource) {
        System.out.println("Resource Ticket added!");
    }

    public void delete(Ticket resource) {
        System.out.println("Resource Ticket deleted!");
    }

    public void update(Ticket resource) {
        System.out.println("Resource Ticket updated!");
    }
}
