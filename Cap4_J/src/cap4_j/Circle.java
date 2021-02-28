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
public class Circle {
    private Double radius;
    private Double diameter;
    private Double area;

    public Circle() {
        this.radius = 1.0;
        this.diameter=this.radius*2;
        this.area = Math.PI*Math.pow(radius,2);         
    }

    public void setRadius(Double radius) {
        this.radius = radius;
        this.diameter=radius*2;
        this.area = Math.PI*Math.pow(radius,2);
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + ", area=" + area + '}';
    }
    
}
