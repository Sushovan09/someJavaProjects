import java.io.*;

public class FileReaderExample {        //File FileReader FileWrite BufferReader BufferWrite InputStreamReader OutputStreamWriter PrintWriter
    public static void main(String[] args)throws FileNotFoundException,IOException {
        String fileName = "c:\\output\\abc.txt";
        FileReader fr = new FileReader(fileName);       //creating FileReader object by using filename

        File f = new File("c:\\output\\abc.txt");
        FileReader fr2 = new FileReader(f);

        char[] arr = new char[200];
        fr.read(arr);
        for (char ch : arr) {
            System.out.print(ch);
        }
        fr.close();
    }
}
