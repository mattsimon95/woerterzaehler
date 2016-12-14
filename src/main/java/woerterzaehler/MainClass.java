package woerterzaehler;

import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Worterzaehler2 w = new Worterzaehler2("C:\\Users\\Simon\\test.txt");
		w.startcounting();
	}

}
