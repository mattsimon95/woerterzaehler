package woerterzaehler;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Worterzaehler2
{
	private int z;
	private String path;
	
	public Worterzaehler2(String p)
	{
	path =p;
	z = 0;
	}
	
	public int startcounting() throws FileNotFoundException
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