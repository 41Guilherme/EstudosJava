package forms;

public class Paralelogramo {
    
    protected double a;
    protected double b;
    protected double h;
    protected double omega;
    
    public Paralelogramo(double a, double b, double h,  double omega) {
        super();
        this.a = a;
        this.b = b;
        this.h = h;
        this.omega = omega;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public double getOmega() {
        return omega;
    }

    public void setAll(double a, double b, double h, double omega){
        this.a = a;
        this.b = b;
        this.h = h;
        this.omega = omega;
    }
    public double calculaPerimetro(){
        return 2* a + 2 *b;
    }

    public double calculaArea(){
        return a* h;
    }
    @Override
    public String toString() {
        return "Paralelogramo [Base=" + a + ", Altura=" + h + ", Angulo=" + omega + "]";
    }
}
