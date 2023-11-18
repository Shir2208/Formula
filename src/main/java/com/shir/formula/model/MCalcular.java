package com.shir.formula.model;
import java.util.Objects;
public class MCalcular {
    private double a;
    private double b;
    private double c;
    private double result1;
    private double result2;

    public MCalcular (String a, String b, String c){
        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
        this.c = Double.parseDouble(c);
    }
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getResult1() {
        return result1;
    }

    public void setResult1(double result1) {
        this.result1 = result1;
    }

    public double getResult2() { return result2; }

    public void setResult2(double result2) {
        this.result2 = result2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCalcular that = (MCalcular) o;
        return Double.compare(a, that.a) == 0 && Double.compare(b, that.b) == 0 && Double.compare(c, that.c) == 0 && Double.compare(result1, that.result1) == 0 && Double.compare(result2, that.result2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, result1, result2);
    }

    @Override
    public String toString() {
        return "Calcular{" +
                "A=" + a +
                ", B=" + b +
                ", C=" + c +
                ", Resultado negativo=" + result1 +
                ", Resultado positivo=" + result2 +
                '}';
    }
}
