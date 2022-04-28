package forms;

public class Quadrado extends Paralelogramo {

    public Quadrado(double a, double b, double h, double omega) {
        super(a, b, h ,omega);
        this.b = a;
        this.h = a;
        this.omega = 1.5708;
    }

    @Override
    public double calculaArea() {
        return  a*a;
    }

    @Override
    public double calculaPerimetro() {
        return a * 4;
    }

    @Override
    public String toString() {
        return "Quadrado [Lado: " + a +" Angulo: " + omega+"]";
    }
    
}
