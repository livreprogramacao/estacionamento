package br.com.livreprogramacao.ticket.entity;

import br.com.livreprogramacao.base.entity.EntityBase;
import br.com.livreprogramacao.marca.entity.Marca;
import br.com.livreprogramacao.modelo.entity.Modelo;
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

    private String numero;

    @NotNull(message = "Por gentileza, informe a Marca!")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Marca marca;

    @NotNull(message = "Por gentileza, informe o Modelo!")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Modelo modelo;

    @NotNull(message = "Por gentileza, informe a Placa!")
    @Size(min = 8, max = 8)
    private String placa;

    public Ticket() {
    }

    public Ticket(Long id, Marca marca, Modelo modelo, String placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
