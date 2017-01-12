package br.com.livreprogramacao.entity.calculadora;

import br.com.livreprogramacao.entity.ticket.Ticket;
import br.com.livreprogramacao.entity.marca.Marca;
import br.com.livreprogramacao.entity.modelo.Modelo;

public class CalculadoraPlacaB99Estacionamento implements CalculadoraEstacionamento {

	public Integer resultado(Ticket ticket) {
		return calcularValorPorPlacaB99(ticket.getPlaca());
	}

	public Integer calcularValorPorPlacaB99(String placa) {
		return 1;	
	}
}
