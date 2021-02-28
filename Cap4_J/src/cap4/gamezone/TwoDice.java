/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4.gamezone;

/**
 *
 * @author ALEW
 */
public class TwoDice {
    
    public static void throwsDice(){
        Die dado1 = new Die();
        Die dado2 = new Die();
        System.out.println("Resultados de los datos: "+dado1.getValue()+" y "+dado2.getValue());
    }
}
