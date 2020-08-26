package a;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Belka {
	
public void meth () {
	int a = 4;
	int b = 0;
	try {
	int res = a / b;
		} catch (Exception e) {
			Logger.getLogger(Belka.class.getName()).log(Level.SEVERE, "lala Belka zero", e);
}
}
}
