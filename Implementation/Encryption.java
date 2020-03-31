import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
      s=s.replaceAll("\\s","");
      
      int x=(int)Math.sqrt(s.length());
      //int cols=(int)Math.ceil(x);
      //int rows=(int)Math.floor(x);
      int rows=x;
      int cols;
      if((int)Math.pow(x,2)==s.length())
      cols=x;
      else cols=x+1;
      if(rows*cols<s.length())
       rows=x+1;
      String ans="";
      
      for(int j=0;j<cols;j++){
          
       for(int i=0;i<rows;i++){
           int k=j+(i*cols);
           if(k<s.length())
           ans+=s.charAt(k);
       }
       ans+=" ";
       
      }

      return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
