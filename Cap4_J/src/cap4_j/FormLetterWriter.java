/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4_j;

/**
 *
 * @author ALEW
 */
public class FormLetterWriter {
    
    public static void displaySalutation(String last_name){
        System.out.println("Dear Mr. or Ms. "+last_name);
    }
    
    public static void displaySalutation(String first_name,String last_name){
        System.out.println("Dear "+first_name+" "+last_name);
    }
}
