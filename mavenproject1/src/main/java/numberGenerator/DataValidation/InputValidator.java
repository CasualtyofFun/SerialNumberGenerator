/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberGenerator.DataValidation;

/**
 *
 * @author VVO
 */
public class InputValidator {
    
    private final int LARGEST_JOB_NUMBER = 99999999;
    private final int SMALLEST_JOB_NUMBER = 0;
    private final int SMALLEST_QUANTITY = 0;
    private final int LARGEST_QUANTITY = 1679615;
    
    public InputValidator(){
        
    }
    
    public boolean validateJobPrefix(int jobNumber){
        if(jobNumber < SMALLEST_JOB_NUMBER ||jobNumber > LARGEST_JOB_NUMBER){return false;
        }return true;        
    }

    public boolean validateQuantityInput(int quantity) {
        if(quantity < SMALLEST_QUANTITY || quantity > LARGEST_QUANTITY){return false;
        }return true;
        }
    
}
