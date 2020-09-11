/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberGenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ListWriter {
    
    private FileWriter fileWriter;
    
    String dir;

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
    public ListWriter(String dir){
        this.dir = dir;
        try{
        fileWriter = new FileWriter(dir);
         }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void writeListToFile(ArrayList<String> list){
        
        for(String s:list){
            try{
            fileWriter.write(s+"\n");
            } catch (IOException e){
                e.printStackTrace();
            }
        
           
    } 
        try{
           fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    
    }

}
