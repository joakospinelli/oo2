package ar.edu.unlp.info.oo2.practica_3.ejercicio_3;

public class WifiConn implements Connection {
    
    public String sendData(String data,int crc){
        return data + " " + crc;
    }

    public String pict(){
        return "conectado por wifi";
    }

}
