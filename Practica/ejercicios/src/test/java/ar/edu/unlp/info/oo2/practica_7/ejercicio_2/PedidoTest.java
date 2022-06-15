package ar.edu.unlp.info.oo2.practica_7.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    
    Cliente cliente;
    Pedido pedido;
    DebitoGatewayProxy medioPago;

    void initialize(){
        this.cliente = new Cliente("Joaquín","Spinelli","123456","email@123.com");
        this.pedido = new Pedido(cliente,200);
        this.medioPago = new DebitoGatewayProxy(100,"123456");
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testPedido(){
        assertFalse(pedido.pagarCon(medioPago));
    }

}
