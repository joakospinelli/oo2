package ar.edu.unlp.info.oo2.practica_3.ejercicio_3;

public class Dispositivo {
    
    private Connection connection;
    private Display display;
    private Ringer ringer;
    private Calculator crcCalculator;

    public Dispositivo(){
        this.display = new Display();
        this.ringer = new Ringer();

        // Al crearse comienza por defecto con Wifi y CRC16
        this.connection = new WifiConn();
        this.crcCalculator = new CRC16_Calculator();
    }

    public String send(String data){
        int crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data,crc);
    }

    public String conectarCon(Connection c){
        this.connection = c;
        this.ringer.ring();
        return this.display.showBanner(this.connection.pict());
    }

    public void configurarCRC(Calculator c){
        this.crcCalculator = c;
    }

}
