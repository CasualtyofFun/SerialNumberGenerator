/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberGenerator;

import GUI.InterfaceFrame;
import java.time.LocalDate;
import numberGenerator.DataValidation.InputValidator;


public class interfaceTest {

    private static String title = "LaunchWorks Serial Number Generator";
    private static InterfaceFrame frame;

    public static void main(String args[]) {
        
        InputValidator validator = new InputValidator();
        int testJobNumber = 99999999;
        int testQuantity = 500;
        LocalDate testDate = LocalDate.now();
        ListWriter writer = new ListWriter("C:\\Users\\GuestLogin\\Desktop\\test.csv");
        BaseConverter base = new BaseConverter(36);

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
