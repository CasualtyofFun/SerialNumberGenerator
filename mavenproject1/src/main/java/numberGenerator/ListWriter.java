/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListWriter {

    File path;

    public ListWriter(File file) {
        this.path = file;
    }

    public void writeListToFile(ArrayList<String> list) {

        try (FileWriter fileWriter = new FileWriter(path)) {
            for (String s : list) {
                fileWriter.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
