package com.boyi.chapter8.jukebox;

public class CDPlayer {
	
	private Playlist p;
	private CD c;
	
	public CDPlayer(CD c,Playlist p){
		this.p=p;
		this.c=c;
	}
	
	public CDPlayer(CD c){
		this.c=c;
	}
	
	public CDPlayer(Playlist p){
		this.p=p;
	}
	
	public Playlist getPlaylist(){
		return p;
	}
	
	public CD getCD(){
		return c;
	}
	
	public void setPlaylist(Playlist p){
		this.p=p;
	}
	
	public void setCD(CD c){
		this.c=c;
	}

}
