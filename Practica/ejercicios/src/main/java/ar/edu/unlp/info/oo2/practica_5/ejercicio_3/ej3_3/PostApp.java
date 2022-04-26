package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Bad smell: método largo
// Refactoring usando: Move method, Extract method, Decompose conditional
public class PostApp {
    
    public List<Post> posts;

    public PostApp(){
        this.posts = new ArrayList<>();
    }

    public List<Post> ultimosPosts(Usuario u,int cantidad){
        List<Post> lista = postsOtrosUsuarios(u);
        ordenarPorFecha(lista);
        return ultimosPost(lista,cantidad);
    }

    private List<Post> postsOtrosUsuarios(Usuario u){
        List<Post> otros = new ArrayList<>();

        for (Post i: posts){
            if (!i.getUsuario().equals(u)){
                otros.add(i);
            }
        }
        return otros;
    }

    private List<Post> ultimosPost(List<Post> lista,int cantidad){
        List<Post> ultimosPosts = new ArrayList<Post>();
	    int index = 0;
	    Iterator<Post> postIterator = lista.iterator();
	    while (postIterator.hasNext() &&  index < cantidad) {
	        ultimosPosts.add(postIterator.next());
	    }
	    return ultimosPosts;
    }

    private void ordenarPorFecha(List<Post> lista){
        for (int i = 0; i < lista.size(); i++) {
            int masNuevo = i;
            for(int j= i +1; j < lista.size(); j++) {
                if (lista.get(j).esMenor(lista.get(masNuevo))){
                    masNuevo = j;
                } 
            }
           Post unPost = lista.set(i,lista.get(masNuevo));
           lista.set(masNuevo, unPost);    
        }
    }

}
