package com.music.app;

import java.io.IOException;
import java.util.Scanner;

import com.music.dao.PlayListOperation;
import com.music.dao.PlayListOperationImpl;
import com.music.model.Song;

public class App {
	// private static Scanner scanner = new Scanner(System.in);
	private static Scanner scanner=new Scanner(System.in);
	private static PlayListOperation playlist = new PlayListOperationImpl();

	public static void main(String[] args) throws IOException {
		
		int option;
		do {
			showMenu();

			System.out.println("Enter Option ");
			option = scanner.nextInt();

			switch (option) {

			case 1:
				putSongToPlayList();
				break;

			case 2:
				deleteSongFromPlayList();
				break;

			case 3:
				checkSongToPlayList();
				break;

			case 4:
				showPlaylist();
				break;

			case 5:
				System.out.println("Thank you for using Music Playlist!");
				break;

			default:
				System.out.println("Invalid Choice!");
			}
			
			
		} while (option != 5);

	}

	private static void showPlaylist() {
		System.out.println("==== PLAYLIST ======");
		playlist.printPlayList();
		System.out.println("=====================");
	}

	private static void checkSongToPlayList() {
		Song song = readSong();

		if (playlist.checkSong(song)) {
			System.out.println("Song is available in the playlist.");
		} else {
			System.out.println("Song not found.");
		}
	}

	private static void deleteSongFromPlayList() {
		Song song = readSong();

		if (playlist.checkSong(song)) {
			playlist.removeSong(song);
			System.out.println("Song deleted successfully.");
		} else {
			System.out.println("Song not found.");
		}
	}

	private static void showMenu() {
		System.out.println();
		System.out.println("========================================");
		System.out.println("          MUSIC PLAYLIST");
		System.out.println("========================================");
		System.out.println(" 1. Add Song");
		System.out.println(" 2. Delete Song");
		System.out.println(" 3. Check Song");
		System.out.println(" 4. Show Playlist");
		System.out.println(" 5. Exit");
		System.out.println("========================================");

	}

	private static Song readSong() {

		System.out.print("Enter Sr No: ");
		int srNo = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Enter Song Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Singer Name: ");
		String singer = scanner.nextLine();

		System.out.print("Liked (true  |   false): ");
		boolean isLiked = scanner.nextBoolean();

		System.out.print("Duration: ");
		double duration = scanner.nextDouble();

		return new Song(srNo, name, singer, isLiked, duration);
	}

	private static void putSongToPlayList() {
		playlist.addSong(readSong());
	}

}
