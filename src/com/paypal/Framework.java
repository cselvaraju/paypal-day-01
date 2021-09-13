package com.paypal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Framework {
	public static QueueIntf getInstance() throws FileNotFoundException {
		File f = new File("config.txt");
		Scanner scanner = new Scanner(f);
		String qType = scanner.nextLine();
		scanner.close();
		
		switch(qType) {
		case "Queue":
			return new Queue();
		case "BetterQueue":
			return new BetterQueue();
		}
		return null;
	}
}
