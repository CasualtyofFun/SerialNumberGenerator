/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberGenerator;

import GUI.InterfaceFrame;

public class Engine {

    private static String title = "LaunchWorks Serial Number Generator";
    private static InterfaceFrame frame;

    public static void main(String args[]) {

        initFrame();

    }

    private static void initFrame() {
        frame = new InterfaceFrame();
        frame.setVisible(true);
        frame.setTitle(title);
        frame.setResizable(false);
        frame.requestFocus();
    }

}
