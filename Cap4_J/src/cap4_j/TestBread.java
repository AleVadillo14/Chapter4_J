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
public class TestBread {

    public static void testBread() {
        Bread [] panaderia = {new Bread("Horn",100),new Bread("Sauce",200),new Bread("Air",20)};
        System.out.println("PAN:");
        for(Bread pan:panaderia)
            System.out.println(pan.toString());
    }
    
}
