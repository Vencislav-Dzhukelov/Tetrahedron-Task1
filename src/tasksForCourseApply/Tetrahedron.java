/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksForCourseApply;

/**
 *
 * @author Darkstar
 */
public class Tetrahedron {

    public static double fill_tetrahedron(int num) {
        double volume;
        volume = ((Math.sqrt(2) * Math.pow(num, 3)) / 12);
        return volume / 1000;
    }

    public static void main(String[] args) {
        int edge = 100;
        double liters = fill_tetrahedron(edge);
        System.out.printf("You can fill Regular tetrahedron with edge of %d cm with %.2f liters of water.\n", edge, liters);

    }
}
