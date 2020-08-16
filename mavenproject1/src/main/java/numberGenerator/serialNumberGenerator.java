package numberGenerator;

import java.time.LocalDate;
import java.util.Random;
import org.apache.commons.lang.StringUtils;



public class serialNumberGenerator {

    private baseConverter base;
    private int largestNumber = 1679615;
    
    public serialNumberGenerator() {
        base = new baseConverter(36);
        
    }
    
    public String generateSerialNumber(int jobNumber, LocalDate date){
        StringBuilder b = new StringBuilder();
        b.append(this.generateJobPrefix(jobNumber));
        System.out.println("After Job Prefix there are " + b.toString().length()+ " characters");
        b.append(this.generateDatePrefix(date));
        System.out.println("After Date Prefix there are " + b.toString().length()+ " characters");
        b.append(this.generateRandomPostfix());
        System.out.println("After Postfix there are " + b.toString().length()+ " characters");
        return b.toString();
    }
    
    private String generateRandomPostfix(){
        Random rand = new Random();
        int r = rand.nextInt(largestNumber);   
        return base.fromDeci(r);
    }

    private String generateJobPrefix(int jobNumber) {

        String s = base.fromDeci(jobNumber);
        if(s.length() < 5){
          s = StringUtils.leftPad(s, 5).replace(" ", "0");
        }
        
        return s;
    }
    
    private int dateToUseable(LocalDate date){
        int month = date.getMonthValue(); int day = date.getDayOfMonth(); int year = date.getYear();
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        StringBuilder b = new StringBuilder();
        year = year - 2000;
        System.out.println(year);
        b.append(month); b.append(day); b.append(year);
        return Integer.parseInt(b.toString());
    }
    
    private String generateDatePrefix(LocalDate date) {

        String s = base.fromDeci(dateToUseable(date));
        
        return s;
    }
    
    
    

}
