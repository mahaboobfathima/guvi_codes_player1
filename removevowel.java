import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Reverse{
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String str = scn.nextLine();
    Pattern pattern = Pattern.compile("[^aeiou]");
    Matcher match = pattern.matcher(str);
    while(match.find())
    {
    	System.out.print(match.group());
    }
}}
