/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livreprogramacao.resource.calculadora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import static org.hamcrest.CoreMatchers.containsString;

/**
 *
 * @author user
 */
public class CalculadoraTarifaTest {
    
    private Client client;
    private final String URI = "http://localhost:8080/api-estacionamento-rest/resources/calculadora";
    private String valor;
    
    @Before
    public void setUp() {
        valor = "5";
        client = ClientBuilder.newClient();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testTicketParaOutrasMarcasModelos() {
        String result = client.target(URI).
                request().
                get(String.class);
        assertThat(result, containsString(valor));
    }
    
    @Test
    public void testCalcularValor() {
    }

}
