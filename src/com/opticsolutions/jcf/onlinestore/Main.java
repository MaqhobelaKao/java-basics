package com.opticsolutions.jcf.onlinestore;

import com.opticsolutions.jcf.onlinestore.menu.Menu;
import com.opticsolutions.jcf.onlinestore.menu.implementations.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}