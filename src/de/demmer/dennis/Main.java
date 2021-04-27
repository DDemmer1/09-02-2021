package de.demmer.dennis;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		Number number;

		int i = 2;

		switch (i) {
		case 1: {
			number = new Integer(0);
			break;

		}
		case 2: {
			number = new Long(0);
			break;
		}

		}
		

		Game game = new Game();

		try {
			game.init();
		} catch (GameConfigException e1) {
			e1.printStackTrace();
		}

//		File file = new File("files/text.txt");
//		
//		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());

//			String line = bufferedReader.readLine();
//			
//			while(line != null) {			
//				System.out.println(line);
//				line = bufferedReader.readLine();
//			}

//			String line;
//			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//			}
//			
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 

	}

}
