package woerterzaehler;
import junit.framework.TestCase;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Tester extends TestCase
{

	@Test
	public void test() throws FileNotFoundException
	{
		Worterzaehler2 c = new Worterzaehler2("C:\\Users\\Simon\\Desktop\\test.txt");
		assertEquals(5, c.startcounting());
	}

}
