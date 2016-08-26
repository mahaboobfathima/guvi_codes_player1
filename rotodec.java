import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static void romanToDecimal(java.lang.String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        /* operation to be performed on upper cases even if user 
           enters roman values in lower case chars */
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = d(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = d(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = d(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = d(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = d(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = d(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = d(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        System.out.println(decimal);
    }

    public static int d(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    public static void main(java.lang.String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    	String str = br.readLine();
        romanToDecimal(str);
    }
}
