package ar.edu.unlp.info.oo2.practica_3.ejercicio_3;

public class Connection4GAdapter implements Connection {

    Connection4G adaptee;

    public Connection4GAdapter(){
        this.adaptee = new Connection4G();
    }

    public String sendData(String data,int crc){
        return this.adaptee.transmit(data,crc);
    }

    public String pict(){
        return this.adaptee.symb();
    }
}
