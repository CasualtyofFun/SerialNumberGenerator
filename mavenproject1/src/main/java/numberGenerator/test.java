package numberGenerator;

import java.time.LocalDate;

/**
 *
 * @author Kyle
 */
public class test {
        
   public static void main(String[] args){
       int testNumber = 99999999;
       LocalDate date;
       baseConverter base = new baseConverter(36);
       serialNumberGenerator gen = new serialNumberGenerator();
       String s = gen.generateSerialNumber(testNumber, LocalDate.of(2021, 10, 31));
       System.out.println(s);             
       
               
               
               
           
}
    
}
