/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberGenerator;

import GUI.InterfaceFrame;
import java.io.File;
import java.time.LocalDate;
import javax.swing.JFrame;
import numberGenerator.DataValidation.InputValidator;
import org.jdatepicker.*;


public class interfaceTest {

    private static String title = "LaunchWorks Serial Number Generator";
    private static InterfaceFrame frame;

    public static void main(String args[]) {
        
        File file;
        ListWriter writer;
 
        initFrame();
        
       
        
               
    }

    private static void initFrame() {
        frame = new InterfaceFrame();
        frame.setVisible(true);
        frame.setTitle(title);
        frame.setResizable(false);
        frame.requestFocus();
    }
;

}
