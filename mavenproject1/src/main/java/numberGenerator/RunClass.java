package numberGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.StringUtils;

public class RunClass {

    private SerialNumberGenerator generator;
    private ArrayList<String> possibleSerialNumbers;
    private ArrayList<String> shuffledArray;

    private final static Logger LOGGER
            = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public RunClass(int jobNumber, LocalDate date) {
        generator = new SerialNumberGenerator(jobNumber, date);
        possibleSerialNumbers = new ArrayList<String>();
        this.intializePossibleSerialNumbers();
        this.initializeShuffledArray();
     }

    private void initializeShuffledArray() {
        shuffledArray = (ArrayList)possibleSerialNumbers.clone();
        Collections.shuffle(shuffledArray);
    }

    private void intializePossibleSerialNumbers() {
        BaseConverter base36 = new BaseConverter(36);
        String s;

        for (int i = 0; i < generator.LARGEST_NUMBER; i++) {
            s = base36.fromDeci(i);
            if (s.length() < 5) {
                s = StringUtils.leftPad(s, 5).replace(" ", "0");
            }
            possibleSerialNumbers.add(s);
        }
    }
    
    public void printArray(ArrayList ar){
        LOGGER.log(Level.INFO, Integer.toString(ar.size()));
        LOGGER.log(Level.INFO, ar.toString());
    }
    
    
    public SerialNumberGenerator getSerialNumberGenerator(){
        return generator;
    }

}
