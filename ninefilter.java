
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ninefilter {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
             br = new BufferedReader(new FileReader("C:/Users/Sony/Documents/dict.csv"));
             bw = new BufferedWriter(new FileWriter("C:/Users/Sony/Documents/nineletter.csv"));
             String tmp = null;
             while((tmp=br.readLine())!=null) {
                 if(tmp.length()<=9&tmp.length()>8) {
                     bw.write(tmp);
                     bw.write(System.getProperty("line.separator"));
                     
                 }
             }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if(br!=null) {
                br.close();
                br=null;
            }
            if(bw!=null){
                bw.close();
                bw=null;
            }
        }
    }
}