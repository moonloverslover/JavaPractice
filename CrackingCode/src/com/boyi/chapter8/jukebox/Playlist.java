package com.boyi.chapter8.jukebox;

import java.util.Queue;

public class Playlist {
	private Song song;
	private Queue<Song> queue;
	
	public Playlist(Song song, Queue<Song> queue){
		
	}
	
	public Song getNextSToPlay(){
		return queue.peek();
	}
	
	public void queueUpSong(Song s){
		queue.add(s);
	}

}
