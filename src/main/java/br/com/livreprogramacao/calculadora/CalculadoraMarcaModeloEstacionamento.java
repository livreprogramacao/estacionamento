package br.com.livreprogramacao.calculadora;

import br.com.livreprogramacao.entity.ticket.Ticket;
import br.com.livreprogramacao.entity.marca.Marca;
import br.com.livreprogramacao.entity.modelo.Modelo;

public class CalculadoraMarcaModeloEstacionamento implements CalculadoraEstacionamento {

    @Override
    public Integer resultado(Ticket ticket) {
        return calcularValorPorMarcaModelo(ticket.getMarca(), ticket.getModelo());
    }

    public Integer calcularValorPorMarcaModelo(Marca marca, Modelo modelo) {
        System.out.println("quando for GM e o modelo for BLAZER o valor é 20;");
        return "GM".equalsIgnoreCase(marca.getNome()) && "BLAZER".equalsIgnoreCase(modelo.getNome()) ? 20 : 0;
    }
}
