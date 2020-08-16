package numberGenerator;

import org.apache.commons.lang.StringUtils;



public class serialNumberGenerator {

    private baseConverter base;

    public serialNumberGenerator() {
        base = new baseConverter(36);
    }

    public String generateJobPrefix(int jobNumber) {

        String s = base.fromDeci(jobNumber);
        if(s.length() < 5){
          s = StringUtils.leftPad(s, 5).replace(" ", "0");
        }
        
        return s;
    }
    
    

}
