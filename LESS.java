import java.util.Scanner;

public class LESS {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String s1 = s.nextLine();
		int len = 0;
		String str[] = s1.split(" ");
		if (str.length - 1 > 0) {
			for (int i = 0; i < str.length - 1; i++) {
				len += 1;
			}
			System.out.println("Number of Spaces is : " + len + " for Entered String " + "/*" + s1 + "*/");
			System.out.println("Lessen Space is : " + (len - 1) + " for Entered String " + "/*" + s1 + "*/");
		} else {
			System.out.println("Lessen Space is : " + (len) + " for Entered String " + "/*" + s1 + "*/");
		}

	}
