// Write a program to accept details of 'n' customers (c_id, cname, address, mobile_no) from
// user and store it in a file using DataOutputStream class.


//if unable to open the file the use fileInputStream and dos.readInt ,dos.readUTF;

import java.util.Scanner;
import java.io.*;
public class slip11Q2 {
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of data n: ");
        int n=sc.nextInt();
        sc.nextLine();

        DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.txt"));

        for(int i=0;i<n;i++){
            System.out.println("Enter id: ");
            int c_id=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name: ");
            String name=sc.next();
            sc.nextLine();

            System.out.println("Enter adress: ");
            String address=sc.next();
            sc.nextLine();

            System.out.println("Enter moblie number: ");
            String m_no=sc.next();
            sc.nextLine();

            dos.writeInt(c_id);
            dos.writeUTF(name);
            dos.writeUTF(address);
            dos.writeUTF(m_no);
        }

        dos.close();
        sc.close();
    }
}
