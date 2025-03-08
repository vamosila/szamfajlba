/*
* File: Store.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: I-N
* Date: 2025-03-08
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Store {
    public void writeFile(){
        try{
            tryWriteFile();
        }catch(IOException e){
            System.err.println("Hiba! A fájl kiírása sikertelen!");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private void tryWriteFile() throws IOException{
        try(FileWriter fw=new FileWriter("adat.txt",Charset.forName("utf-8"),false);Scanner sc=new Scanner(System.in)){
            double num=-1;
            // do {
            while (num!=0){
                System.out.print("Szám: ");
                String numStr=sc.nextLine();
                if(numStr.matches("[+-]?[0-9]+\\.?[0-9]*|[+-]?\\.[0-9]+")){
                    num=Double.parseDouble(numStr);
                    fw.write(Double.toString(num)+"\n");
                }else{
                    System.err.println("Kérem, számot adjon meg!\n");
                }
            } //while (num!=0);
    
            // while(true){
            //     System.out.print("Szám: ");
            //     String numStr=sc.nextLine();
            //     if(numStr.matches("[+-]?[0-9]+\\.?[0-9]*|[+-]?\\.[0-9]+")){
            //         double num=Double.parseDouble(numStr);
            //         fw.write(Double.toString(num)+"\n");
            //         if(num==0){
            //             break;
            //         }
            //     }else{
            //         System.err.println("Kérem, számot adjon meg!\n");
            //         continue;
            //     }
            // }
        }
    }
}
