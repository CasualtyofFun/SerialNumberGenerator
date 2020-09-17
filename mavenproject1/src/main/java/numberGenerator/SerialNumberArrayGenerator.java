package numberGenerator;

import java.time.LocalDate;
import java.util.ArrayList;

public class SerialNumberArrayGenerator {

    private SerialNumberGenerator generator;
    private ArrayList<String> serialNumberList;

    public SerialNumberArrayGenerator(int jobNumber, LocalDate date) {
        generator = new SerialNumberGenerator(jobNumber, date);
        serialNumberList = new ArrayList<>();
    }

    public ArrayList<String> generateXSerialNumbers(int quantity) {

        for (int i = 0; i < quantity; i++) {
            serialNumberList.add(generator.generateSerialNumber());
        }
        return serialNumberList;
    }

    public SerialNumberGenerator getSerialNumberGenerator() {
        return generator;
    }

}
