package numberGenerator;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Kyle
 */
public class Test {
        
   public static void main(String[] args){
       int testJobNumber = 99999999;
       int testQuantity = 500;
       LocalDate testDate = LocalDate.now();
       
       
       BaseConverter base = new BaseConverter(36);
       SerialNumberGenerator gen = new SerialNumberGenerator(testJobNumber, testDate);
       RunClass runClass = new RunClass(testJobNumber, testDate);
       
       ArrayList<String> testArray = runClass.generateXSerialNumbers(testQuantity);
       System.out.println(testArray.size());
       System.out.println(testArray.toString());
}
    
}
