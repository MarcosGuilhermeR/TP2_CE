/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcos
 */
public class Individual {
    private double fitness;
    private double X[];

    public Individual(int N) {
        X = new double[N];
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public double[] getX() {
        return X;
    }

    public void setX(double[] X) {
        this.X = X;
    }
}
