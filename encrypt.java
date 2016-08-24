import java.io.*;
class HelloWorld{

     public static void main(String []args) throws Exception{
       BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
       String str = br.readLine();
       char[] ch = str.toCharArray();
       for(int i = 0; i < ch.length; i++)
       {
           if((int)ch[i]==97)
                ch[i] = (char)(((int)(ch[i])) + 26);
           ch[i] = (char)((int)(ch[i])-1);
       }
       for(int i = 0; i < ch.length; i++)
            System.out.println(ch[i]);
     }
}
