/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial4;

import java.util.*;

/**
 *
 * @author Wayndeen
 */
public class main {

    public static void main(String[] args)
    {
        double totalAmount = 0, amount = 0;
        String paymentType,name,expireDate,cNumber;
        int totalCredit = 0, totalCash = 0;
        List<Payment> aPayment = new ArrayList<Payment>();

        Scanner key = new Scanner(System.in);

        System.out.print("Payment Type <Cash>/<Credit> : ");
        paymentType = key.nextLine();

        System.out.print("Sales amount? : ");
        amount = key.nextDouble();
        key.nextLine();



          if (paymentType.equalsIgnoreCase("Cash"))
          {
              aPayment.add(new CashPayment(amount));
              System.out.println(aPayment.toString());
          }

          else if(paymentType.equalsIgnoreCase("Credit"))
          {
              System.out.print("Credit Card Holder Name : ");
              name = key.nextLine();
              System.out.print("Expired on : (mm/yy) ");
              expireDate = key.nextLine();
              System.out.print("Credit Number : ");
              cNumber = key.nextLine();

              aPayment.add(new CreditCardPayment(amount,name,expireDate,cNumber));
              System.out.println("Using card (" + name + "["+ cNumber + "] exp: " + expireDate);
              System.out.println();
              System.out.println(aPayment.toString());
          }
    }
}
