package numberGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import numberGenerator.DataValidation.InputValidator;

/**
 *
 * @author Kyle
 */
public class Test {
        
   public static void main(String[] args){
       boolean inputIsValid = true;
       InputValidator validator = new InputValidator();
       int testJobNumber = 99999999;
       int testQuantity = 500;
       LocalDate testDate = LocalDate.now();
       //ListWriter writer = new ListWriter("C:");
       BaseConverter base = new BaseConverter(36);
       
       Scanner sc = new Scanner(System.in);
       
       do{
       System.out.println("Enter Job Number");
       testJobNumber = sc.nextInt();
       inputIsValid = validator.validateJobPrefix(testJobNumber);
       }while(!inputIsValid);
       
       do{
       System.out.println("Enter Quantity of S/Ns");
       testQuantity = sc.nextInt();
       inputIsValid = validator.validateQuantityInput(testQuantity);
       }while(!inputIsValid);
       
       
       SerialNumberGenerator gen = new SerialNumberGenerator(testJobNumber, testDate);
       RunClass runClass = new RunClass(testJobNumber, testDate);
       
       ArrayList<String> testArray = runClass.generateXSerialNumbers(testQuantity);
       System.out.println(testArray.size());
       System.out.println(testArray.toString());
       
       //writer.writeListToFile(testArray);
}
    
}
