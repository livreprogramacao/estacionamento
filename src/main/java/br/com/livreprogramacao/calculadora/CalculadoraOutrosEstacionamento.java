package br.com.livreprogramacao.calculadora;

import br.com.livreprogramacao.entity.ticket.Ticket;

public class CalculadoraOutrosEstacionamento implements CalculadoraEstacionamento {

    @Override
    public Integer resultado(Ticket ticket) {
        System.out.println("demais marcas e modelos o valor é 5;");
        return 5;
    }

}
