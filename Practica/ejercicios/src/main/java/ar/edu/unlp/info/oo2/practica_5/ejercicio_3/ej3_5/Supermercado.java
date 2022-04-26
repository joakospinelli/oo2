package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_5;

import java.text.MessageFormat;

// Bad smell: Clase de datos, envidia de atributos
// Refactoring usando: Move method
public class Supermercado {

    public void notificarPedido(long nroPedido, Cliente cliente) {
        String notificacion = MessageFormat.format
        ("Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}",
        new Object[] { nroPedido, cliente.getDireccionFormateada() });
   
       System.out.println(notificacion);
     }

    }
   
