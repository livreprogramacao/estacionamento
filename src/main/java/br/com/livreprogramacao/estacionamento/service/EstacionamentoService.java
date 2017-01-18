package br.com.livreprogramacao.estacionamento.service;

import br.com.livreprogramacao.estacionamento.calculadora.CalculadoraMarcaEstacionamento;
import br.com.livreprogramacao.estacionamento.calculadora.CalculadoraMarcaModeloEstacionamento;
import br.com.livreprogramacao.estacionamento.calculadora.CalculadoraOutrosEstacionamento;
import br.com.livreprogramacao.estacionamento.calculadora.CalculadoraPlacaB99Estacionamento;
import br.com.livreprogramacao.marca.entity.Marca;
import br.com.livreprogramacao.modelo.entity.Modelo;
import br.com.livreprogramacao.ticket.entity.Ticket;
import java.util.ArrayList;
import java.util.List;

public class EstacionamentoService {

    private final List<Marca> marcaCollection = new ArrayList<>(10);
    private final List<Modelo> modeloCollection = new ArrayList<>(10);
    private final List<Ticket> ticketCollection = new ArrayList<>(10);

    public EstacionamentoService() {

        Long marcaId = 1L;
        String nomeMarca = "Chevrolet";
        Marca chevrolet = new Marca(10001L, nomeMarca);
        marcaCollection.add(chevrolet);

        Long modeloId = 1L;
        String nomeModelo = "Blazer";
        Modelo blazer = new Modelo(modeloId, chevrolet, nomeModelo);
        modeloCollection.add(blazer);

        Long ticketId = 1L;
        String placa = "HJK-7858";
        Ticket ticketBlazer = new Ticket(ticketId, blazer, placa);
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

    public Ticket add(Ticket resource) {
        System.out.println("Resource Ticket added!");
        calcularValorEstadia(resource);
        return resource;
    }

    public void delete(Ticket resource) {
        System.out.println("Resource Ticket deleted!");
    }

    public Ticket update(Ticket resource) {
        System.out.println("Resource Ticket updated!");
        return resource;
    }
    
    private void calcularValorEstadia(Ticket ticket) {
        Integer valor = 0;
        
        valor = valor > 0 ? valor : new CalculadoraMarcaEstacionamento().resultado(ticket);
        valor = valor > 0 ? valor : new CalculadoraMarcaModeloEstacionamento().resultado(ticket);
        valor = valor > 0 ? valor : new CalculadoraPlacaB99Estacionamento().resultado(ticket);
        valor = valor > 0 ? valor : new CalculadoraOutrosEstacionamento().resultado(ticket);
        System.out.format("Debug -- valor cobrado R$ %s para o Ticket %s", valor, ticket);
    }
    
}
