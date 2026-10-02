// Write a program that displays the number of characters, lines and words of a file.
import java.io.*;
public class slip18Q2{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        int l=0;
        int c=0;
        int w=0;
        String line;

        while((line=br.readLine())!=null){
            l++;
            c=c+line.length();
            String[] arr=line.split(" ");
            w=w+arr.length;
        }

        System.out.println("line: "+l);
         System.out.println("words: "+w);
          System.out.println("char: "+c);

    }
}