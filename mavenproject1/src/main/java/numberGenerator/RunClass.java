package numberGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.commons.lang.StringUtils;

public class RunClass {

    private SerialNumberGenerator generator;
    private ArrayList<String> serialNumberList;
    
    public RunClass(int jobNumber, LocalDate date) {
        generator = new SerialNumberGenerator(jobNumber, date);
        serialNumberList = new ArrayList<>();
     }
    
    
    public ArrayList<String> generateXSerialNumbers(int quantity){
        
        for(int i = 0; i <= quantity; i++){
           serialNumberList.add(generator.generateSerialNumber());
        }
        return serialNumberList;
    }
    
    public SerialNumberGenerator getSerialNumberGenerator(){
        return generator;
    }

}
