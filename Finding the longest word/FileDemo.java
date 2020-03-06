import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileDemo{
        public static void main(String[] args)
        {
            int count = 0;
            
            try(FileReader fr = new FileReader("log.txt");BufferedReader br = new BufferedReader(fr);) {
                String line;
                int length = 0;
                String s = "";
                
                while((line=br.readLine())!= null) {
                    StringTokenizer st = new StringTokenizer(line);
                    while(st.hasMoreTokens()) {
                        String sample = st.nextToken();
                        if(sample.length()>length) {
					    length = sample.length();
					    s = sample;
                    }
                }
            }
            System.out.println(s);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        }
}
