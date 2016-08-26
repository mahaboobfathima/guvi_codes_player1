import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		int temp = 1;
		for(int i =1; i <= num;i++)
		{
			temp = temp * i;
		}
		
		System.out.println(temp);

	}

}
