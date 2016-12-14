package woerterzaehler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class WordCount {
  
	//schaut ob aktuelles Zeichen ein Trennzeichen ist
    public static boolean isDelimiter(char c,String del) {
        int i;

        // Ist aktuelles Zeichen ein Delimiter?
        i=0;
        while((i<del.length()) && (c!=del.charAt(i))) {
            i++;
        }
        return (i<del.length());
    }

  
    public static int countWords(String s,String del) {
        int i;
        int wc; // word count
        wc=0;
        i=0;
        while(i<s.length()) {
            // Delimiter �berlesen
            while((i<s.length()) && (isDelimiter(s.charAt(i),del))) {
                i++;
            }

            // Neues Wort ?
            if(i<s.length()) {
                wc++;
            }

            // Wort �berlesen
            while((i<s.length()) && (!isDelimiter(s.charAt(i),del))) {
                i++;
            }
        }
        return wc;
    }

    /**
     * Liest von der Konsole ein und gibt die Anzahl der W�rter aus.
     *
     * @param args Optional ein String mit zu verwendenen Trennzeichen
     *
     * @throws IOException Bei Ein-/Ausgabeproblemen
     */
    public static void main(String[] args) throws IOException {
        String delimiters;
        BufferedReader in;
        String line;
        int wc;

        // Optionales Programmargument auswerten
        if(args.length==0) {
            delimiters=new String(",. :;+*?!()<>");
        } else {
            delimiters=args[0];
        }

        
        wc=0;
        FileReader fr = new FileReader("C:\\Users\\Simon\\test.txt");
        in = new BufferedReader(fr);
        line=in.readLine();
        while(line!=null) {
            System.out.println(line);
            wc+=countWords(line,delimiters);
            line=in.readLine();
        }

        // Ergebnis ausgeben
        System.out.print("Sie haben "+wc);
        System.out.print(wc==1 ? " Wort" : " Worte");
        System.out.print(" eingegeben!\n");
    }
}