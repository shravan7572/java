//  Write a program to accept a filename from user. Check whether file exist or not. If it exist
// then its size and last modified time.
import java.io.File;
import java.util.Date;
import java.util.Scanner;
public class slip21Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a file name: ");
       String filename=sc.nextLine();
      

       File f= new File(filename);
         Date date=new Date(f.lastModified());
       if(f.exists()){
        System.out.println("the file exists. ");
        System.out.println("the size is : "+f.length());
        System.out.println("the last mod date: "+date);
       }
       else{
        System.out.println("file does not exist");
       }
    }
    
}
