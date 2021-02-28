/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4.caseproblems;

/**
 *
 * @author ALEW
 */
public class RentalDemo {
    
    public static void testRental(){
        Rental r1 = new Rental();
        Rental r2 = new Rental("G003",200);
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
