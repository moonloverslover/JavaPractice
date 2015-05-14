package com.boyi.chapter8.jukebox;

public class Song {

	private Artist artist;
	private int length;
	private Genre genre;
	private String name;
	
	public Song(Artist artist, int length, Genre genre, String name){
		
	}
	
	public Artist getArtist(){
		return artist;
	}
	
	public Genre getGenre(){
		return genre;
	}
	
	public String getName(){
		return name;
	}
	
	
}
