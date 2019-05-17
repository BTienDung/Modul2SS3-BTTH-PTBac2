package season_3.PTBacHai;
//ax^2+bx+c =0;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    QuadraticEquation(){};
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    };
    public double getDiscriminant(){
        double denta = getB()*getB() - 4*getA()*getC();
        return denta;
    }

    public double getRoot1(){
        double r1 = (-b-Math.sqrt(getDiscriminant())/2*getA());
        return r1;
    }

    public double getRoot2(){
        double r2 = (-b-Math.sqrt(getDiscriminant())/2*getA());
        return r2;
    }


}
