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
    private double punicaoG, punicaoH, FuncaoObj, Gx, Hx;

    public double getGx() {
        return Gx;
    }

    public void setGx(double Gx) {
        this.Gx = Gx;
    }

    public double getHx() {
        return Hx;
    }

    public void setHx(double Hx) {
        this.Hx = Hx;
    }

    public double getPunicaoG() {
        return punicaoG;
    }

    public void setPunicaoG(double punicaoG) {
        this.punicaoG = punicaoG;
    }

    public double getPunicaoH() {
        return punicaoH;
    }

    public void setPunicaoH(double punicaoH) {
        this.punicaoH = punicaoH;
    }

    public double getFuncaoObj() {
        return FuncaoObj;
    }

    public void setFuncaoObj(double FuncaoObj) {
        this.FuncaoObj = FuncaoObj;
    }
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
