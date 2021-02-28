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
public class EventDemo {
    public static void testEvent(){
        Event event = new Event();
        Event event1 = new Event("G003",100);
        
        System.out.println(event.toString());
        System.out.println(event1.toString());
    }
}
