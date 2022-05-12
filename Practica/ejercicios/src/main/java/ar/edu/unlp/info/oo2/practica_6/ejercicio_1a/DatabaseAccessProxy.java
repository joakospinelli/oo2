package ar.edu.unlp.info.oo2.practica_6.ejercicio_1a;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseAccessProxy implements DatabaseAccess {

    private DatabaseRealAccess db;
    private boolean autenticado;

    public DatabaseAccessProxy(DatabaseRealAccess db){
        this.db = db;
        this.autenticado = false;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!this.checkAccess()){
            throw new RuntimeException("Acceso denegado");
        }
            Logger.getLogger("search").log(Level.INFO,"Acceso para búsquedas aceptado");
            return db.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!this.checkAccess()){
            throw new RuntimeException("Acceso denegado");
        }
        Logger.getLogger("insert").log(Level.WARNING,"Acceso para inserciones aceptado");
        return db.insertNewRow(rowData);
    }
    
    public void authenticate(){
        this.autenticado = true;
    }

    private boolean checkAccess(){
        if (!this.autenticado)
            Logger.getLogger("insert").log(Level.SEVERE,"Acceso denegado");
        return this.autenticado;
    }

}
