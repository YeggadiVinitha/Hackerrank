import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         char c= s.charAt(s.length()-2);
         int q=0,w=0;
         Integer an=0;
         q=s.charAt(0)-48;
             w=s.charAt(1)-48;
             an=(q*10+w)+12;
         if(c=='P'||c=='p'){
             
             if(an<24){
             String lol=an.toString();
             return lol+s.substring(2,s.length()-2);}
             else  return s.substring(0,s.length()-2);

         }
         else{
             if(an==24)
              return "00"+s.substring(2,s.length()-2);
         return s.substring(0,s.length()-2);
         }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
