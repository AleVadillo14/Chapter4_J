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
public class TestBirdSighting {

    public TestBirdSighting(String name,Integer seen,Integer days) {
        BirdSighting2 bird = new BirdSighting2(name,seen,days);
        System.out.println(bird.toString());
    }
    
}
