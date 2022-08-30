package com.opticsolutions.onlinestore.withlist;

import com.opticsolutions.onlinestore.withlist.menu.Menu;
import com.opticsolutions.onlinestore.withlist.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
