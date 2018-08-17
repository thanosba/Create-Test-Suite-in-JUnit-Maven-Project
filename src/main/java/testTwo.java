import org.junit.Test;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class testTwo {
    @Test
    public void testcaseTwo() {
        try {
            URL mySite = new URL("http://www.google.com");
            URLConnection yc = mySite.openConnection();
            Scanner in = new Scanner(new InputStreamReader(yc.getInputStream()));
            int count = 0;
            while (in.hasNext()) {
                System.out.println(in.next());
                count++;
            }
            System.out.println("Number of tokens: " + count);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
