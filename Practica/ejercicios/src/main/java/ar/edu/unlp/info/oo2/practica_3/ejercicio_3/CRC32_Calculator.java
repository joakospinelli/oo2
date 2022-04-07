package ar.edu.unlp.info.oo2.practica_3.ejercicio_3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator {

    public int crcFor(String data){ 
        CRC32 crc = new CRC32();
        String datos = data;
        crc.update(datos.getBytes());
        long result = crc.getValue();
        Long l = result;
        return l.intValue();
    }

}
