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
public class SandwichFilling {
    private String filling_type;
    private Integer calories;

    public SandwichFilling(String filling_type, Integer calories) {
        this.filling_type = filling_type;
        this.calories = calories;
    }

    public String getFilling_type() {
        return filling_type;
    }

    public Integer getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SandwichFilling{" + "filling_type=" + filling_type + ", calories=" + calories + '}';
    }
    
}
