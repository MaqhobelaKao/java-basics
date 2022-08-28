package com.opticsolutions.onlinestore;

import com.opticsolutions.onlinestore.menu.Menu;
import com.opticsolutions.onlinestore.menu.implementations.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}