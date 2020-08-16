/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberGenerator;

public class baseConverter {

    int base;

    public baseConverter(int base) {
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
