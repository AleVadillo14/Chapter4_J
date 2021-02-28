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
public class TestCircle{
    
    public static void testCircles(Circle ... c){
        for(Circle cir:c)
            System.out.println(cir.toString());
    }
    
}
