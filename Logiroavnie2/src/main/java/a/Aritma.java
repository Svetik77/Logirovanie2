package a;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Aritma {

	public void meth() {
		int a = 4;
		int b = 0;
		try {
			int res = a / b;
		} catch (Exception e) {
			Logger.getLogger(Aritma.class.getName()).log(Level.SEVERE, "lala zero", e);
		}
	}
	
	public static void main(String[] args) {
		Aritma a = new Aritma();
		a.meth();
	}
}
