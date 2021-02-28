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
public class Sandwich {
    private Bread pan;
    private SandwichFilling ingre;
    private Integer Total_calories=0;

    public Sandwich(Bread pan, SandwichFilling ingre) {
        this.pan = pan;
        this.ingre = ingre;
        
        Total_calories+=(pan.getCalories()+pan.getCalories());
    }

    @Override
    public String toString() {
        return "Sandwich{" + "pan=" + pan.getType() + ", ingre=" + ingre.getFilling_type() +", calories="+this.Total_calories+'}';
    }
    
    
}
