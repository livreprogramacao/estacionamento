package br.com.livreprogramacao.estacionamento.calculadora;

import br.com.livreprogramacao.marca.entity.Marca;
import br.com.livreprogramacao.ticket.entity.Ticket;

public class CalculadoraMarcaEstacionamento implements CalculadoraEstacionamento {

    @Override
    public Integer resultado(Ticket ticket) {
        return calcularValorPorMarca(ticket.getMarca());
    }

    public Integer calcularValorPorMarca(Marca marca) {
        System.out.println("quando for marca FORD o valor é 10;");
        return "FORD".equalsIgnoreCase(marca.getNome()) ? 10 : 0;
    }
}
