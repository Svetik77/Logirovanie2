package logirovanie;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import  myformat.MyFormatter;

public class LogExample5 {

	private final static Logger log = Logger.getLogger(LogExample5.class.getName());

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		log.setLevel(Level.ALL); // or all or off
		// log.setLevel(Level.OFF);

		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.INFO);
		log.addHandler(ch);
		log.info("it is my ConsoleHandler");

		// now i want logger to the file
		FileHandler fh;
		try {
			fh = new FileHandler("LogExample5.log", true);
			fh.setFormatter(new MyFormatter());
			fh.setLevel(Level.FINE);
			log.addHandler(fh);
		} catch (SecurityException | IOException e) {
//			e.printStackTrace();
			log.log(Level.SEVERE, "My message from exception ", e);
		}

		try {
			throw new java.io.IOException("couldn't read some file bla bla");
		} catch (IOException e) {
			log.log(Level.SEVERE, "haha file read error", e);
		}

		log.log(Level.INFO, "My First log");
		log.setLevel(Level.FINE);
	}

	public void test() {

	}

}

/*
 * SEVERE (highest value) WARNING INFO CONFIG FINE FINER FINEST (lowest value)
 */

/*
 * SEVERE (highest value) WARNING INFO ^ go up levels , if info will check :
 * info, warning, severe
 */