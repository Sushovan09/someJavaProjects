import java.io.*;
public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fw = null;
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter stop to quit ");
        try {
            fw = new FileWriter("abc.txt",true);
            do{
                System.out.print(": ");
                s = br.readLine();
                if(s.compareTo("stop")==0){
                    break;
                }
                s = s+"\n";
                fw.write(s);
            }while(s.compareTo("stop")!=0);
        }
        catch(IOException io) {
            System.out.println("Write error occurred");
        }
        finally{
            try {
                br.close();
                fw.close();
            }
            catch(IOException a){
                System.out.println("Io exception occured");
            }
        }
    }
}
