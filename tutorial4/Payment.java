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
public class Payment 
{
    public double amount;

    public Payment(double amount) {
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {        
        return "Cash payment ," + "amount paid is : " + amount ;
    }
    
}