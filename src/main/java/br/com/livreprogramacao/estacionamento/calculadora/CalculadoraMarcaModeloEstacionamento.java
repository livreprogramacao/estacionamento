package br.com.livreprogramacao.estacionamento.calculadora;

import br.com.livreprogramacao.estacionamento.marca.entity.Marca;
import br.com.livreprogramacao.estacionamento.modelo.entity.Modelo;
import br.com.livreprogramacao.estacionamento.ticket.entity.Ticket;

public class CalculadoraMarcaModeloEstacionamento implements CalculadoraEstacionamento {

    @Override
    public Integer resultado(Ticket ticket) {
        return calcularValorPorMarcaModelo(ticket.getModelo().getMarca(), ticket.getModelo());
    }

    public Integer calcularValorPorMarcaModelo(Marca marca, Modelo modelo) {
        System.out.println("quando for GM e o modelo for BLAZER o valor é 20;");
        return "GM".equalsIgnoreCase(marca.getNome()) && "BLAZER".equalsIgnoreCase(modelo.getNome()) ? 20 : 0;
    }
}
