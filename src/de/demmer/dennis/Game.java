package de.demmer.dennis;

import java.io.*;


public class Game {
	
	
	public void init() throws GameConfigException{
		
		if(new File("config.txt").exists() == false) {
			throw new GameConfigException("Config nicht gefunden");
		}
		
	}
	


}
