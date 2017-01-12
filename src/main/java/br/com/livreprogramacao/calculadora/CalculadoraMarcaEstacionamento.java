package br.com.livreprogramacao.entity.calculadora;

import br.com.livreprogramacao.entity.ticket.Ticket;
import br.com.livreprogramacao.entity.marca.Marca;

public class CalculadoraMarcaEstacionamento implements CalculadoraEstacionamento {

	public Integer resultado(Ticket ticket) {
		return calcularValorPorMarca(ticket.getMarca());
	}

	public Integer calcularValorPorMarca(Marca marca) {
		return 10;	
	}
}
