package br.com.livreprogramacao.ticket.entity;

import br.com.livreprogramacao.base.entity.EntityBase;
import br.com.livreprogramacao.marca.entity.Marca;
import br.com.livreprogramacao.modelo.entity.Modelo;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
@Entity
public class Ticket extends EntityBase {

    @Basic
    private String numero;

    @NotNull(message = "Por gentileza, informe o Modelo!")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Modelo modelo;

    @NotNull(message = "Por gentileza, informe a Placa!")
    @Size(min = 8, max = 8)
    private String placa;

    public Ticket() {
    }

    public Ticket(final Long _id, final Modelo _modelo, final String _placa) {
        this.id = _id;
        this.modelo = _modelo;
        this.placa = _placa;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", modelo=" + modelo + ", placa=" + placa + '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(final String numero) {
        this.numero = numero;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(final Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(final String placa) {
        this.placa = placa;
    }

}
