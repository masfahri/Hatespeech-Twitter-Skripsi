/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author sayam
 */
public class InsertWords {
    
    public static void main(String[] args) {
    String txtWords = "C:/Users/ayam/Documents/NetBeansProjects/TestSkripsi/build/classes/ID-OpinionWords-master/positive.txt";
        try{
            FileReader fr = new FileReader(txtWords);
            BufferedReader br = new BufferedReader(fr);
            
            String txt;
            while((txt = br.readLine()) != null)
                System.out.println(txt);
        }catch (FileNotFoundException e) {
            e.getMessage();
        }catch (IOException ioe){
            ioe.getMessage();
        }
    }
}
