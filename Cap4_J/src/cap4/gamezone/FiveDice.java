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
public class FiveDice {
    public static void throwsDice(){
        int i = 0;
        Die [] tiros = new Die[10];
        System.out.println("Mis tiros:");
        for(Die t:tiros){
            t = new Die();
            System.out.println(t.getValue());
            if(i==4) System.out.println("The Computer:");
            i++;
        }
    }
}
