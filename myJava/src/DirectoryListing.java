import java.io.*;
public class DirectoryListing {
    public static void main(String[] args) {
        String dirName = "dir1";
        File f = new File(dirName);
        if(f.isDirectory()){
            System.out.println("directory : "+dirName);
            String[] str = f.list();
            for (String s1 : str) {
                File f2 = new File(dirName+"/"+s1);
                if(f2.isDirectory()){
                    System.out.println(s1+" is a directory");
                }
                else{
                    System.out.println(s1+" is a file");
                }
            }
        }
        else{
            System.out.println("not Directory");
        }
    }
}
