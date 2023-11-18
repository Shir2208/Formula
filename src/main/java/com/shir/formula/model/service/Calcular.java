package com.shir.formula.model.service;
import com.shir.formula.model.MCalcular;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calcular {
    private final MCalcular mCalcular;
    public Calcular(MCalcular mCalcular){
        this.mCalcular = mCalcular;
    }

    public void result1(){

        double p = pow(mCalcular.getB(),2)-4* mCalcular.getA()*mCalcular.getC();
        if (p < 0){
            p = -p;
        }
        double result1 = (-mCalcular.getB() - (sqrt(p)))/2* mCalcular.getA();
        mCalcular.setResult1(result1);
    }

    public void result2(){
        double p = pow(mCalcular.getB(),2)-4* mCalcular.getA()*mCalcular.getC();
        if (p < 0){
            p = -p;
        }
        double result2 = (-mCalcular.getB() + (sqrt(p)))/2* mCalcular.getA();
        mCalcular.setResult2(result2);
    }

}
