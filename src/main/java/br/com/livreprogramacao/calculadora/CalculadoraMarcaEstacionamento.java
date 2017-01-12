package br.com.livreprogramacao.calculadora;

import br.com.livreprogramacao.entity.ticket.Ticket;
import br.com.livreprogramacao.entity.marca.Marca;

public class CalculadoraMarcaEstacionamento implements CalculadoraEstacionamento {

	public Integer resultado(Ticket ticket) {
		return calcularValorPorMarca(ticket.getMarca());
	}

	public Integer calcularValorPorMarca(Marca marca) {
		System.out.println("quando for marca FORD o valor é 10;");
		return 10;	
	}
}
