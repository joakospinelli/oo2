package ar.edu.unlp.info.oo2.practica_1.ejercicio_1;
import java.util.*;
import java.util.stream.Collectors;

public class Twitter {
	
	private ArrayList<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<>();
	}
	
	public Usuario addUsuario(String name) {
		
		if (nombreDisponible(name)) {
			Usuario u = new Usuario(name);
			this.usuarios.add(u);
			return u;
		} else return null;
				
	}
	
	public void removeUsuario(Usuario u) {
		u.removeTweets();
		this.usuarios.remove(u);
	}
	
	public TweetOriginal tweet(String content,Usuario u) {
		if (verificarCaracteres(content)) {
			return u.tweet(content);
		} else return null;
	}
	
	public Retweet retweet(TweetOriginal t,Usuario u) {
		return u.retweet(t);
	}
	
	public boolean usuarioExiste(Usuario u) {
		return this.usuarios.contains(u);
	}
	
	private static boolean verificarCaracteres(String content) {
		if ((content.length() > 0) &&(content.length() <= 140)) {
			return true;
		} else return false;
	}
	
	private boolean nombreDisponible(String name) {
		List<String> nombres = this.usuarios.stream()
									.map(i -> i.getScreenName())
									.collect(Collectors.toList());
		return !(nombres.contains(name));
	}
	
	
}
