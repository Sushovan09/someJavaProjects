package encodeDecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class encode {
    public static void encode(String[] args) {
        int i;
        FileInputStream fin;

        if(args.length != 1){
            System.out.println("please specify an valid input");
        }
        //opening the file
        try{
            fin = new FileInputStream(args[0]);
        }catch(FileNotFoundException e){
            System.out.println("cannot open file");
            return;
        }
        //reading the file
        try{
            do{
                i=fin.read();
                if(i!=-1){
                    System.out.println((char)i);
                }
            }while(i!=-1);
        }catch (IOException e){
            System.out.println("error reading file");
        }
        //closing the file
        try{
            fin.close();
        }catch(IOexception e) {
            System.out.println("error in closing the file");
        }
    }
}
