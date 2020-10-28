/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial4;

/**
 *
 * @author Wayndeen
 */
public class CashPayment extends Payment {
    
    public CashPayment(double amount) 
    {
        super(amount);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "CashPayment, " + "amount paid is : " + amount ;
    }
    
}
