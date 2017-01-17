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

    public Ticket add(Ticket resource) {
        System.out.println("Resource Ticket added!");
        return resource;
    }

    public void delete(Ticket resource) {
        System.out.println("Resource Ticket deleted!");
    }

    public Ticket update(Ticket resource) {
        System.out.println("Resource Ticket updated!");
        return resource;
    }
    
    public void calcularValor(Ticket ticket) {
        executarCalculadora(ticket);
    }

    private void executarCalculadora(Ticket ticket) {
        Integer valor1 = new CalculadoraMarcaEstacionamento().resultado(ticket);
        Integer valor2 = new CalculadoraMarcaModeloEstacionamento().resultado(ticket);
        Integer valor3 = new CalculadoraPlacaB99Estacionamento().resultado(ticket);
        Integer valor4 = new CalculadoraOutrosEstacionamento().resultado(ticket);
        Integer valor = valor1+valor2+valor3+valor4;
        System.out.format("Debug -- valor cobrado R$ %s para o Ticket %s", valor, ticket);
    }
    
}
