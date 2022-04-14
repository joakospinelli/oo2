package ar.edu.unlp.info.oo2.practica_4.ejercicio_1;

import java.util.Collection;
import java.util.List;

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
            return db.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!this.checkAccess()){
            throw new RuntimeException("Acceso denegado");
        }
        return db.insertNewRow(rowData);
    }
    
    public void authenticate(){
        this.autenticado = true;
    }

    private boolean checkAccess(){
        return this.autenticado;
    }

}
