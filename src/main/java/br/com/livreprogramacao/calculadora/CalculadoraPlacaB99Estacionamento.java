package br.com.livreprogramacao.calculadora;

import br.com.livreprogramacao.ticket.entity.Ticket;

public class CalculadoraPlacaB99Estacionamento implements CalculadoraEstacionamento {

    @Override
    public Integer resultado(Ticket ticket) {
        return calcularValorPorPlacaB99(ticket.getPlaca());
    }

    public Integer calcularValorPorPlacaB99(String placa) {
        System.out.println("quando a placa contem B e termina com 99 o valor é 1;");
        return placa.contains("B") && placa.endsWith("99") ? 1 : 0;
    }

}
