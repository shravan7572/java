
//  Write a program to copy the contents from one file into another file in upper case.
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class slip23Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter src file : ");
        String src = sc.nextLine();

        System.out.println("enter dest file : ");
        String dest = sc.nextLine();

        try{
            FileReader fr=new FileReader(src);
            FileWriter fw=new FileWriter(dest);
            int ch;
            while((ch=fr.read())!=-1){
            fw.write(Character.toUpperCase((char)ch));
            }

            fr.close();
            fw.close();

            System.out.println("the file copied sucessfully");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
