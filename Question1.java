/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

/**
 *
 * @author Wayndeen
 */
import java.util.*;
public class Question1 {

  public static void main(String[] argv)
    {
        int survey;
        double paid=0;
        Scanner key = new Scanner(System.in);
        System.out.print("Enter total Survay : ");
        survey = key.nextInt();

        if (survey < 5)
        {
            paid = 10*survey;
        }
        else if (survey >= 5)
        {
            paid = (survey/5*70.00) + (survey%5*10.00);
        }
        System.out.println("Total amount paid = "+paid);
    }
}
