package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_3;

import java.time.LocalDateTime;

// Bad smell: método largo
// Refactoring usando: Move method, Extract method, Decompose conditional
public class Post {

    private Usuario usuario;
    private LocalDateTime fecha;
    private String texto;

    public Post(Usuario usuario, String texto){
        this.usuario = usuario;
        this.fecha = LocalDateTime.now();
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public LocalDateTime getFecha(){
        return this.fecha;
    }

    public String getTexto(){
        return this.texto;
    }

    public boolean esMenor(Post p){
        return this.getFecha().isAfter(p.getFecha());
    }

}
