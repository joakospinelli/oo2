package ar.edu.unlp.info.oo2.practica_1.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter twitter;
	Usuario user1;
	Usuario user2;
	TweetOriginal tweet1;
	Retweet tweet2;
	
	void initialize() {
		twitter = new Twitter();
		user1 = twitter.addUsuario("joaquin1");
		user2 = twitter.addUsuario("joaquin2");
		tweet1 = twitter.tweet("Hello world!", user2);
		tweet2 = twitter.retweet(tweet1, user1);
	}
	
	@BeforeEach
	void setUp() {
		this.initialize();
	}
	
	@Test
	public void testUsuario() {
		assertTrue(twitter.usuarioExiste(user1));
		assertTrue(twitter.usuarioExiste(user2));
		assertEquals(null,twitter.addUsuario("joaquin1")); // No debería agregarse por nombre repetido
	}
	
	@Test
	public void testTweet() {
		assertEquals(tweet2.getOriginal(),tweet1);
		assertEquals("Hello world!",tweet1.getContent());
	}

	@Test
	public void testRemove() {
		twitter.removeUsuario(user2);
		assertTrue(!twitter.usuarioExiste(user2));
	}
}




