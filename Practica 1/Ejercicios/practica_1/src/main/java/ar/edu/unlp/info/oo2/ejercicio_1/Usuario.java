package ar.edu.unlp.info.oo2.ejercicio_1;
import java.util.ArrayList;

public class Usuario {
	
	private String screenName;
	private ArrayList<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<>();
	}
	
	public TweetOriginal tweet(String content) {
		TweetOriginal t = new TweetOriginal(content);
		this.tweets.add(t);
		return t;
	}
	
	public Retweet retweet(TweetOriginal t) {
		Retweet r = new Retweet(t);
		this.tweets.add(r);
		return r;
	}
	
	public void removeTweets() {
		this.tweets.clear();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
}
