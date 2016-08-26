import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
 public static void main(String ap[]) throws IOException
 {
	 BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	 String str = br.readLine();
	 str = str.toLowerCase();
	 if(str.equals("sunday") || str.equals("saturday"))
		 System.out.println("Holiday");
	 else
		 System.out.println("Working Day");
 }
}
