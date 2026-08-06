package com.music.app;

import java.util.Scanner;

import com.music.dao.PlayListOperation;
import com.music.dao.PlayListOperationImpl;

public class App {
	private static Scanner scanner = new Scanner(System.in);
	private static PlayListOperation playlist = new PlayListOperationImpl();

	public static void main(String[] args) {

		showMenu();
		int option;
		System.out.println("Enter Option ");
		option = scanner.nextInt();

		switch (option) {
		case 1:

		}

	}

	private static void showMenu() {
		System.out.println("*********  WELCOME *********");
		System.out.println("CREATE PLAYLIST");
		System.out.println("  1 :  ADD SONG  ");
		System.out.println("  2 :  DELETE SONG  ");
		System.out.println("  3 :  CHECK SONG  ");
		System.out.println("  4 :  SHOW PLAYLIST  ");
		System.out.println("---------------------------");

	}

	private static void putSongToPlayList() {
		System.out.println("Enter Sr No :");
		int srNo = scanner.nextInt();
		System.out.println("ENter Song Name ");
		String name = scanner.nextLine();
		System.out.println("Enter Singer NAme");
		String singer = scanner.nextLine();
		System.out.println("Enter Like OR DISLIKED");
		boolean isLike = scanner.nextBoolean();
		System.out.println("Time Duration");
		double duration = scanner.nextDouble();
	}

}
