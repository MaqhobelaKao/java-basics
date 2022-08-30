package com.opticsolutions.onlinestore.withoutlist;

import com.opticsolutions.onlinestore.withoutlist.menu.Menu;
import com.opticsolutions.onlinestore.withoutlist.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
