package ar.edu.unlp.info.oo2.practica_1.ejercicio_3;

import java.util.ArrayList;


/* 
 * Agregué algunos métodos para probar que funcionen las clases
 */
public class MediaPlayer {
	
	private ArrayList<Media> playlist;
	
	public MediaPlayer() {
		this.playlist = new ArrayList<>();
	}
	
	public Audio addAudio(String name) {
		Audio a = new Audio(name);
		this.playlist.add(a);
		return a;
	}
	
	public VideoFile addVideoFile(String name) {
		VideoFile v = new VideoFile(name);
		this.playlist.add(v);
		return v;
	}
	
	public VideoStreamAdapter addVideoStream(String name) {
		VideoStreamAdapter vs = new VideoStreamAdapter(name);
		this.playlist.add(vs);
		return vs;
	}
	
	 // Reproduzco y borro de la lista cuando termina de reproducir
	public ArrayList<Media> playEverything() {
		ArrayList<Media> tracks = new ArrayList<>();
		
		for (Media i: this.playlist) {
			tracks.add(i);
		}
		
		return tracks;
	}
	
	// Reproduzco sólo el primer elemento y lo borro de la lista
	public String playFirst() {
		String play = playlist.get(0).play();
		playlist.remove(0);
		return play;
	}
	
}
