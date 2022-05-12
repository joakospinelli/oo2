package ar.edu.unlp.info.oo2.practica_6.ejercicio_1b;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseAccessProxy implements DatabaseAccess {

    private DatabaseRealAccess db;
    private boolean autenticado;
    private Logger messageLogger;

    public DatabaseAccessProxy(DatabaseRealAccess db){
        this.db = db;
        this.autenticado = false;
        messageLogger = Logger.getLogger("message");
        ConsoleHandler upperCaseHandler = new ConsoleHandler();
        ConsoleHandler JSONHandler = new ConsoleHandler();
        upperCaseHandler.setFormatter(new UpperCaseFormatter());
        JSONHandler.setFormatter(new JSONFormatter());
        messageLogger.addHandler(JSONHandler);
        messageLogger.addHandler(upperCaseHandler);
        messageLogger.setUseParentHandlers(false); // No sé que hace esto pero si no va imprime 2 veces cada log (y una sin mayus)
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!this.checkAccess()){
            throw new RuntimeException("Acceso denegado");
        }
        messageLogger.info("Acceso para búsquedas aceptado");
        return db.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!this.checkAccess()){
            throw new RuntimeException("Acceso denegado");
        }
        messageLogger.warning("Acceso para inserciones aceptado");
        return db.insertNewRow(rowData);
    }
    
    public void authenticate(){
        this.autenticado = true;
    }

    private boolean checkAccess(){
        if (!this.autenticado)
            messageLogger.severe("Acceso denegado");
        return this.autenticado;
    }

}
