package day46_JavaRecap.ShapeTask;

public class Circle extends Shape{

    private double r, d;
    private static double PI;

    static {
        PI=3.14;
    }

    public Circle(double r) {
        super("Circle");

        if (r<=0){
            throw  new RuntimeException("No Such a Circle with a radius of: "+r);
        }

        setR(r);
        setD(r*2);
        //this.r = r;
        //this.d = d;
    }

    public double getR() { return r;}

    public void setR(double r) {this.r = r;
    }

    public double getD() { return d;
    }

    public void setD(double d) {this.d = d;
    }

    public double area(){
        return r*r*PI;
    }
    public double perimeter(){
        return 2*PI*r;
    }



}
