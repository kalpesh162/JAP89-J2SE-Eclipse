package com.music.dao;

import java.util.ArrayList;

import com.music.model.Song;

public class PlayListOperationImpl implements PlayListOperation {
	private ArrayList<Song> musicList = new ArrayList<Song>();

	@Override
	public void addSong(Song song) {
		musicList.add(song);
	}

	@Override
	public boolean checkSong(Song song) {
		return musicList.contains(song);
	}

	@Override
	public void removeSong(Song song) {
		musicList.remove(song);
	}

	@Override
	public void printPlayList() {
		for (Song song : musicList)
			System.out.println(song);

	}

}
