package ar.edu.unlp.info.oo2.ejercicio_1;

public class Retweet implements Tweet{
	
	private TweetOriginal original;
	
	public Retweet(TweetOriginal original) {
		this.original = original;
	}
	
	public TweetOriginal getOriginal() {
		return this.original;
	}

}

