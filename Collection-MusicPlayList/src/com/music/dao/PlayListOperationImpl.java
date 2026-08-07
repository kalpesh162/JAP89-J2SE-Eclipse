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

	/*
	 * System.out.printf("%-5d %-25s %-25s %-5b   %-5.2f", song.getSrNo(),
	 * song.getName(), song.getSinger(), song.isLiked(), song.getDuration());
	 * 
	 */
	@Override
	public void printPlayList() {
		System.out.printf("%-5s %-25s %-25s %-5s   %-5s \n", "ID", "NAME", "SINGER", "LIKE", "TIME ");
		for (Song song : musicList) {
			System.out.println(song);
		}
	}

}
