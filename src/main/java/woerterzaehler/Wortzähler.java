package woerterzaehler;
import java.io.*;

class Wortzähler
{
  public static void main(String[] args) throws IOException
  {
    FileReader fr = new FileReader("..\\test.txt");
    BufferedReader br = new BufferedReader(fr);

    String zeile = br.readLine();
    

    br.close();
  }
}