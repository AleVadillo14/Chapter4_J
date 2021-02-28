/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4_j;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ALEW
 */
public class NextMoth {
    public static void nextMoth(){
        Calendar c1 = new GregorianCalendar();
        System.out.println("Faltan "+(c1.getActualMaximum(Calendar.DAY_OF_MONTH)-c1.get(Calendar.DAY_OF_MONTH)+1)+" dias para el próximo mes");
    }
}
