/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberGenerator.DataValidation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InputValidator {

    private final int LARGEST_JOB_NUMBER = 99999999;
    private final int SMALLEST_JOB_NUMBER = 0;
    private final int SMALLEST_QUANTITY = 0;
    private final int LARGEST_QUANTITY = 1679615;

    private final static Logger LOGGER
            = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public InputValidator() {

    }

    public boolean validateJobPrefix(int jobNumber) {
        if (jobNumber < SMALLEST_JOB_NUMBER || jobNumber > LARGEST_JOB_NUMBER) {
            LOGGER.log(Level.INFO, "Job Number Out of Bounds");
            return false;
        }
        return true;
    }

    public boolean validateJobPrefix(String jobNumber) {
        int jn;

        try {
            jn = Integer.parseInt(jobNumber);
        } catch (NumberFormatException e) {
            LOGGER.log(Level.INFO, e.toString());
            return false;
        }

        if (jn < SMALLEST_JOB_NUMBER || jn > LARGEST_JOB_NUMBER) {
            LOGGER.log(Level.INFO, "Job Number Out Of Bounds");
            return false;
        }
        return true;
    }

    public boolean validateQuantityInput(int quantity) {
        if (quantity < SMALLEST_QUANTITY || quantity > LARGEST_QUANTITY) {
            LOGGER.log(Level.INFO, "Quantity Out of Bounds");
            return false;
        }
        return true;
    }

    public boolean validateQuantityInput(String quantity) {
        int qty;

        try {
            qty = Integer.parseInt(quantity);
        } catch (NumberFormatException e) {
            LOGGER.log(Level.INFO, e.toString());
            return false;
        }

        if (qty < SMALLEST_QUANTITY || qty > LARGEST_QUANTITY) {
            LOGGER.log(Level.INFO, "Quantity Field Out of Bounds");
            return false;
        }
        return true;
    }
}
