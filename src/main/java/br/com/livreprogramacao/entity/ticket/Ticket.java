package br.com.livreprogramacao.entity.ticket;

import br.com.livreprogramacao.entity.base.EntityBase;
import br.com.livreprogramacao.entity.marca.Marca;
import br.com.livreprogramacao.entity.modelo.Modelo;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 *
 * @author user
 */
@Entity
public class Ticket extends EntityBase {

    private String numero;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Marca marca;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Modelo modelo;

    private String placa;

    public Ticket() {
    }

    public Ticket(Long id, Marca marca, Modelo modelo, String placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
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
