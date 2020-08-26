package numberGenerator;

public class BaseConverter {

    int base;

    public BaseConverter(int base) {
        this.base = base;
    }

    private char reVal(int num) {
        if (num >= 0 && num <= 9) {
            return (char) (num + 48);
        } else {
            return (char) (num - 10 + 65);
        }
    }

    public String fromDeci(int inputNum) {
        String s = "";

        // Convert input number is given  
        // base by repeatedly dividing it 
        // by base and taking remainder 
        while (inputNum > 0) {
            s += reVal(inputNum % base);
            inputNum /= base;
        }
        StringBuilder ix = new StringBuilder();

        // append a string into StringBuilder input1  
        ix.append(s);

        // Reverse the result 
        return new String(ix.reverse());
    }

}
