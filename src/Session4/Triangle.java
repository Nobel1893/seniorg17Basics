/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session4;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape{

    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double CalculateArea() {
        return 0.5*width*height;
    }
 
    
}
