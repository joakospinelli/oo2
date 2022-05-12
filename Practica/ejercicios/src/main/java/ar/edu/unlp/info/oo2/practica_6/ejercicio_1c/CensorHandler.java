package ar.edu.unlp.info.oo2.practica_6.ejercicio_1c;

import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;
import java.util.Arrays;
import java.util.List;

public class CensorHandler extends ConsoleHandler{

    private List<String> censor;

    public CensorHandler(List<String> censor){
        this.censor = censor;
    }

    public void publish(LogRecord record) {
        List<String> msg = Arrays.asList(record.getMessage().split(" "));
        for(int i=0;i<msg.size();i++){
            if (this.censor.contains(msg.get(i).trim())){
                msg.set(i, "***");
            }
        }
        record.setMessage(String.join(" ", msg) + "\n");
        System.err.println(getFormatter().format(record));
    }

    @Override
    public void flush() {
        
    }

    @Override
    public void close() throws SecurityException {
        
    }

}
