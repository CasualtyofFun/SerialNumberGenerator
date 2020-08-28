package numberGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import org.apache.commons.lang.StringUtils;



public class SerialNumberGenerator {

    private BaseConverter base;
    private int jobNumber;
    private LocalDate date;
    private ArrayList<String> randomPostfixes;
    private int randomPostfixesIndex;
    
    public static final int LARGEST_NUMBER = 1679615;
    
    public SerialNumberGenerator(int jobNumber, LocalDate date) {
        this.jobNumber = jobNumber;
        this.date = date;
        randomPostfixes = generatePossiblePosfix();
        Collections.shuffle(randomPostfixes);
        randomPostfixesIndex = 0;
        base = new BaseConverter(36);
    }
    
    public String generateSerialNumber(){
        StringBuilder b = new StringBuilder();
        b.append(this.generateJobPrefix(jobNumber));
        b.append(this.generateDatePrefix(date));
        b.append(this.getNextPostfix());
        return b.toString();
    }
    
    private String generateRandomPostfix(){
        Random rand = new Random();
        int r = rand.nextInt(LARGEST_NUMBER);   
        return base.fromDeci(r);
    }

    private String generateJobPrefix(int jobNumber) {

        String s = base.fromDeci(jobNumber);
        if(s.length() < 5){
          s = StringUtils.leftPad(s, 5).replace(" ", "0");
        }
        
        return s;
    }
    
    private String getNextPostfix(){
        randomPostfixesIndex++;
        return randomPostfixes.get(randomPostfixesIndex);
    }
    
    private static ArrayList<String> generatePossiblePosfix() {
        BaseConverter base36 = new BaseConverter(36);
        ArrayList<String> postfixes = new ArrayList<String>();
        String s;

        for (int i = 0; i < LARGEST_NUMBER; i++) {
            s = base36.fromDeci(i);
            if (s.length() < 5) {
                s = StringUtils.leftPad(s, 5).replace(" ", "0");
            }
            postfixes.add(s);
        }
        return postfixes;
    }
    
    
    private int dateToUseable(LocalDate date){
        int month = date.getMonthValue(); int day = date.getDayOfMonth(); int year = date.getYear();
        StringBuilder b = new StringBuilder();
        year -= 2000;
        b.append(month); b.append(day); b.append(year);
        return Integer.parseInt(b.toString());
    }
    
        
    
    private String generateDatePrefix(LocalDate date) {

        String s = base.fromDeci(dateToUseable(date));
        
        return s;
    }
    
}
