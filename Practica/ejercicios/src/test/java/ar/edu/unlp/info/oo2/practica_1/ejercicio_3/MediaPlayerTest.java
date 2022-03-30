package ar.edu.unlp.info.oo2.practica_1.ejercicio_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MediaPlayerTest {
	
	MediaPlayer player;
	Audio audio;
	VideoFile video;
	VideoStreamAdapter videoStream;
	
	void initialize() {
		player = new MediaPlayer();
	}
	
	@BeforeEach
	void setUp() {
		this.initialize();
	}
	
	@Test
	void testMedia() {
		audio = player.addAudio("Track 1");
		assertTrue(player.playEverything().contains(audio));
	}
	
	@Test
	void testAdapter() {
		videoStream = player.addVideoStream("Track VS");
		
		assertEquals("Reproduciendo Track VS via Video Stream", player.playFirst());
	}
}
