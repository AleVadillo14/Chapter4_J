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
public class TestSandwichFilling {
     public static void testFillings() {
        SandwichFilling [] panaderia = {new SandwichFilling("Tomate",50),new SandwichFilling("Lettuce",10),new SandwichFilling("Egg Salada",20)};
         System.out.println("INGREDIENTES:");
        for(SandwichFilling pan:panaderia)
            System.out.println(pan.toString());
    }

}
