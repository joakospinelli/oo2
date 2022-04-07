package ar.edu.unlp.info.oo2.practica_3.ejercicio_3;

public class Connection4G {
    
    public String transmit(String data,int crc){
        return data + " " + crc;
    }

    public String symb(){
        return "conectado por 4g";
    }

}
