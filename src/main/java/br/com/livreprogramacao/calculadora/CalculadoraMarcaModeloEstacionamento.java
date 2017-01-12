package br.com.livreprogramacao.entity.calculadora;

import br.com.livreprogramacao.entity.ticket.Ticket;
import br.com.livreprogramacao.entity.marca.Marca;
import br.com.livreprogramacao.entity.modelo.Modelo;

public class CalculadoraMarcaModeloEstacionamento implements CalculadoraEstacionamento {

	public Integer resultado(Ticket ticket) {
		return calcularValorPorMarcaModelo(ticket.getMarca(), ticket.getModelo());
	}

	public Integer calcularValorPorMarcaModelo(Marca marca, Modelo modelo) {
		return 20;	
	}
}
