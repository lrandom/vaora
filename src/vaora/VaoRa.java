/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaora;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author Lrandom
 */
public class VaoRa {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try {
//          FileInputStream fis =new FileInputStream("data.txt");
//          BufferedInputStream buf =new BufferedInputStream(fis);
//          int c ;
//          while((c=buf.read())!=-1){
//              System.out.println((char)c);
//          }
//          buf.close();
//          fis.close();
//        } catch (Exception e) {
//          e.printStackTrace();
//        }  
//          try {
//              FileReader fileReader = new FileReader("data.txt");
//              BufferedReader buff =new BufferedReader(fileReader);
//              String c;
//              while( (c=buff.readLine())!=null){
//                  System.out.println(c);
//              }
//              buff.close();
//              fileReader.close();
//          } catch (Exception e) {
//              e.printStackTrace();
//          }

 /*       try {
            FileOutputStream fos = new FileOutputStream("data.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String nd = "HIHI";
            bos.write(nd.getBytes());
            bos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            FileWriter fw = new FileWriter("data2.txt");
            BufferedWriter bufw = new BufferedWriter(fw);
            String content ="Hi";
            fw.write(content);
            bufw.write(content);
            bufw.close();
            fw.close();
        } catch (Exception e) {
            
        }
        
     */
        try {
            URL url = new URL("https://image.redbull.com/rbcom/010/2015-07-27/1331737542701_2/0010/1/1050/656/1/moon-hill-natural-bridge-in-china.jpg");
            InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream("natural.jpg");
            int length;
            byte[] b = new byte[2*1024];
            while((length=is.read(b))!=-1){
               fos.write(b, 0, length);
            }
            is.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
