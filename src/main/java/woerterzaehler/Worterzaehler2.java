package woerterzaehler;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Worterzaehler2
{
	private String path ;
	private int z = 0;
	
	
	public int startcounting(String path) throws FileNotFoundException
	{
		
			Scanner scan = new Scanner(new FileInputStream(path));
			while(scan.hasNext())
			{
				scan.next();
				z++;
			}
			
			System.out.println("Anzahl der Wörter " + z);		
		return z;
	}
}