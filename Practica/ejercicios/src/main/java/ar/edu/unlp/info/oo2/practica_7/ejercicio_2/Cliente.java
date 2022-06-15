package ar.edu.unlp.info.oo2.practica_7.ejercicio_2;

public class Cliente {

    private String nombre;
    private String apellido;
    private String cbu;
    private String email;
    
    public Cliente(String nombre, String apellido, String cbu, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cbu = cbu;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCbu() {
        return this.cbu;
    }
    
}
